package Email;

import com.grpc.Email.SendEmail;
import com.grpc.Email.grpcEmailGrpc;

import io.grpc.stub.StreamObserver;

import org.springframework.beans.factory.annotation.Value;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class emailService extends grpcEmailGrpc.grpcEmailImplBase {


    private SendEmail.EmailResponse.Builder response;

    public emailService() {

        response = SendEmail.EmailResponse.newBuilder();
    }

    @Override
    public void sendEmail(SendEmail.EmailRequest request, StreamObserver<SendEmail.EmailResponse> responseObserver) {

        // email request object
        EmailClass emailClass = new EmailClass();
        emailClass.setTo(request.getTo());
        emailClass.setFrom(request.getFrom());
        emailClass.setSubject(request.getSubject());
        emailClass.setMessage(request.getMessage());
        emailClass.setFilePath(request.getFilePath());

        try {
            this.sendSimpleEmail(emailClass, responseObserver);
        } catch (IOException | MessagingException e) {
            e.printStackTrace();
        }


    }

    private void sendSimpleEmail(EmailClass emailClass,  StreamObserver<SendEmail.EmailResponse> responseObserver) throws MessagingException, IOException {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");


        try {
            Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("sthashristi777@gmail.com", "**********");
                }
            });

            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("sthashristi777@gmail.com", false));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailClass.getTo()));
            msg.setSubject(emailClass.getSubject());
            msg.setContent(emailClass.getMessage(), "text/html");
            msg.setSentDate(new Date());

            System.out.print("emailClass Object: " + emailClass.toString());

            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(emailClass.getMessage(), "text/html");

            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(messageBodyPart);

            MimeBodyPart attachPart = new MimeBodyPart();
            attachPart.attachFile(new File(emailClass.getFilePath()));
            mimeMultipart.addBodyPart(attachPart);

            msg.setContent(mimeMultipart);
            Transport.send(msg);

            response.setResponseCode(0).setResponseMessage("Message sent. ").setFrom(emailClass.getFrom()).setTo(emailClass.getTo()).setSubject(emailClass.getSubject()).setMessage(emailClass.getMessage());

        } catch (MessagingException e) {
            System.out.println(" \n email not sent due to: " + e);
            e.printStackTrace();
        }

        responseObserver.onNext(response.build()); // send response data back to the client
        responseObserver.onCompleted();

    }
}
