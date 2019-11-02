package ipLocation;

import com.grpc.iplocation.IpToLocation;
import com.grpc.iplocation.ipToLocationGrpc;

import com.maxmind.geoip.LookupService;
import com.maxmind.geoip.Region;
import com.maxmind.geoip.regionName;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.*;

import io.grpc.stub.StreamObserver;
import org.apache.commons.validator.routines.InetAddressValidator;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

public class IpLocationService extends ipToLocationGrpc.ipToLocationImplBase {

    // using external package
    public boolean validateIp(String ip){
        InetAddressValidator validator =  InetAddressValidator.getInstance();

        // Validate an IPv4 address
        if (validator.isValidInet4Address(ip)) {
            System.out.print("The IP address " + ip + " is valid");
            return true;
        }
        else {
            System.out.print("The IP address " + ip + " isn't valid");
            return false;
        }
    }


    @Override
    public void getMyLocationFromIp(IpToLocation.IpLocationRequest request, StreamObserver<IpToLocation.IpLocationResponse> responseObserver) {
        System.out.println("Inside getMyLocationFromIp rpc/api of ipToLocation service in protobuf..");
        String ip =  request.getIp();

        // validate ip
        boolean isValidated = this.validateIp(ip);

        // object where db response is stored prior to rpc/api response object
        IpLocation ipLocation = null;

        // build rpc/api response whether or not ip is validated
        IpToLocation.IpLocationResponse.Builder response = IpToLocation.IpLocationResponse.newBuilder();

        if(isValidated){
            File file = new File("D:\\springboot\\Spring\\protobuf\\GeoLite2-City.mmdb");

            try{
                DatabaseReader reader = new DatabaseReader.Builder(file).build();
                InetAddress ipAddress = InetAddress.getByName(ip);
                CityResponse cityResponse = reader.city(ipAddress);


                ipLocation = new IpLocation();
                ipLocation.setIp(ip);
                ipLocation.setType("IPV4");

                Continent continent = cityResponse.getContinent();
                System.out.println("\n Continent: " +continent.getName());
                ipLocation.setContinentName(continent.getName());

                Country country = cityResponse.getCountry();
                System.out.println("\n Country: " +country.getName()); // 'Nepal'
                ipLocation.setCountryName(country.getName());

                /*Subdivision subdivision = cityResponse.getMostSpecificSubdivision();
                System.out.println("\n Subdivision: " + subdivision.getName());    // 'Minnesota'
                System.out.println("\n Subdivision iso code: "+ subdivision.getIsoCode()); // 'MN'
                ipLocation.setContinentName(continent.getName());

                City city = cityResponse.getCity();
                System.out.println("\n city: " + city.getName()); // 'Kathmandu' */

                Location location = cityResponse.getLocation();
                System.out.println(location.getLatitude());  // 44.9733
                System.out.println(location.getLongitude()); // -93.2323
                ipLocation.setLatitude(location.getLatitude().toString());
                ipLocation.setLongitude(location.getLongitude().toString());

                response.setIp(ipLocation.getIp()).setType(ipLocation.getType()).setContinentName(ipLocation.getContinentName()).setCountryName(ipLocation.getCountryName()).setLatitude(ipLocation.getLatitude()).setLongitude(ipLocation.getLongitude()).setResponseCode(0);


            }catch(IOException | GeoIp2Exception e ){
                System.out.print("Exception occured: " + e);
            }

            /*
            File file = new File("D:\\springboot\\Spring\\protobuf\\GeoLite2-City.mmdb");
            System.out.println("\n file : " + file);
            IpLocation ipLocation = null;
            try{
                ipLocation = new IpLocation();
                LookupService lookup = new LookupService(file,LookupService.GEOIP_MEMORY_CACHE);
                System.out.println("Hola: " + lookup+ "with ip: "+ ip);
                Location locationServices = lookup.getLocation(ip); // problem
                System.out.println("\n after getlocation of locationservices... \n");
                ipLocation.setCountryName(locationServices.countryName);
                ipLocation.setRegionName(regionName.regionNameByCode(
                        locationServices.countryCode, locationServices.region));
                ipLocation.setCityName(locationServices.city);
                ipLocation.setLatitude(String.valueOf(locationServices.latitude));
                ipLocation.setLongitude(String.valueOf(locationServices.longitude));
                ipLocation.setIp(ip);
                ipLocation.setType("IPV4");
                System.out.println("My iplocation: " + ipLocation.toString());

                response.setIp(ipLocation.getIp()).setType(ipLocation.getType()).setCountryName(ipLocation.getCountryName()).setRegionName(ipLocation.getRegionName()).setCity(ipLocation.getCityName()).setLatitude(ipLocation.getLatitude()).setLongitude(ipLocation.getLongitude()).setResponseCode(0);

            }catch(IOException e){
                    System.out.println("Exception caught " + e);
                }

             */
        }
        else{
            System.out.println("Ip not validated by server...");
            response.setResponseCode(1);
        }
        responseObserver.onNext(response.build()); // send response data back to the client
        responseObserver.onCompleted();

    }
}
