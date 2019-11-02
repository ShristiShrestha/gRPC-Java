package gRPCserver;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import ipLocation.IpLocationService;
import SMS.smsService;

import java.io.IOException;


public class GRPCserver {
    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(9090).addService(new IpLocationService()).addService(new smsService()).build();

        server.start();
        System.out.println("Server started at port:" + server.getPort());
        server.awaitTermination();
    }
}
