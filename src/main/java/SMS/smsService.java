package SMS;

import com.grpc.SMS.SendSMS;
import com.grpc.SMS.grpcSMSGrpc;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import io.grpc.stub.StreamObserver;

public class smsService extends grpcSMSGrpc.grpcSMSImplBase {

    final String messageBirdAPI = " 0Ns552X9creP6xlqOHIBY4Uqu";
    final String twilio_ACCOUNT_SID = "ACcde80b6b459b7312488cb4e671bb16fd";
    final String twilio_AUTH_TOKEN = "7d175c2d9c3cb771f7fda63ff32f1431";


    @Override
    public void sendSMS(SendSMS.SmsRequest request, StreamObserver<SendSMS.SmsResponse> responseObserver) {

        // bind request to a java object
        SmsClass smsClass = new SmsClass();
        smsClass.setSender(request.getSenderNumber());
        smsClass.setReceiver(request.getReceiverNumber());
        smsClass.setMessage(request.getMessage());

        // create response object sent from grpc server i.e. build rpc/api response whether or not ip is validated
        SendSMS.SmsResponse.Builder response = SendSMS.SmsResponse.newBuilder();

        // using Twilio api to send sms
        // Find your Account Sid and Token at twilio.com/user/account

        Twilio.init(twilio_ACCOUNT_SID, twilio_AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(smsClass.getReceiver()), // to
                new PhoneNumber("+12568889325"), // from
                smsClass.getMessage()).create(); // message

        System.out.println(message.getSid());
        response.setReceiverNumber(smsClass.getReceiver()).setResponseCode(0).setResponseMessage("Message has been delivered as: " + smsClass.getMessage());

        responseObserver.onNext(response.build()); // send response data back to the client
        responseObserver.onCompleted();

        /*
        // send message using MessageBird API

        // Create a MessageBirdService
        final MessageBirdService messageBirdService = new MessageBirdServiceImpl(messageBirdAPI);

        // Add the service to the client
        final MessageBirdClient messageBirdClient = new MessageBirdClient(messageBirdService);

        // convert String number into acceptable format
        BigInteger phoneNumber = new BigInteger(smsClass.getReceiver()); // pass receiver number string
        final List<BigInteger> phones = new ArrayList<BigInteger>();
        phones.add(phoneNumber);

        // create response object sent from grpc server i.e. build rpc/api response whether or not ip is validated
        SendSMS.SmsResponse.Builder response = SendSMS.SmsResponse.newBuilder();

        try {
            final MessageResponse smsResponse = messageBirdClient.sendMessage("", smsClass.getMessage() + "\n Sent by " + smsClass.getSender(), phones);
            System.out.println("\n SMS response: " + smsResponse.toString());

            response.setReceiverNumber(smsClass.getReceiver()).setResponseCode(0).setResponseMessage("Message has been delivered as: " + smsClass.getMessage());

        } catch (UnauthorizedException | GeneralException ex) {
            System.out.println(ex.toString());
        }

        responseObserver.onNext(response.build()); // send response data back to the client
        responseObserver.onCompleted();

        */

    }

}
