package SMS;

import com.grpc.SMS.SendSMS;
import com.grpc.SMS.grpcSMSGrpc;
import io.grpc.stub.StreamObserver;

public class smsService extends grpcSMSGrpc.grpcSMSImplBase {

    @Override
    public void sendSMS(SendSMS.SmsRequest request, StreamObserver<SendSMS.SmsResponse> responseObserver) {

    }
}
