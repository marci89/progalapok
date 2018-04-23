
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


/*
gradleban:
// https://mvnrepository.com/artifact/javax.mail/mail
    compile group: 'javax.mail', name: 'mail', version: '1.5.0-b01'
// https://mvnrepository.com/artifact/javax.activation/activation
    compile group: 'javax.activation', name: 'activation', version: '1.1.1'
 */

public class Main {

    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;

    public static void main(String args[]) throws AddressException, MessagingException {
        generateAndSendEmail();
        System.out.println("\n\n ===> Your Java Program has just sent an Email successfully. Check your email..");
    }




    public static void generateAndSendEmail() throws AddressException, MessagingException {

        // Step1
        System.out.println("\n 1st ===> setup Mail Server Properties..");
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        System.out.println("Mail Server Properties have been setup successfully..");

        // Step2

        //javatestemail123456789@gmail.com
        //kismarczirobi@gmail.com
        System.out.println("\n\n 2nd ===> get Mail Session..");
        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        generateMailMessage = new MimeMessage(getMailSession);
        // itt állítod be hgy hova...
        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("kismarczirobi@gmail.com"));
        generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("kismarczirobi@gmail.com"));
        //cím
        generateMailMessage.setSubject("hali");
        //szöveg
        String emailBody = "ez egy teszt email, ha látood, akkor működik a kód";
        generateMailMessage.setContent(emailBody, "text/html");
        System.out.println("Mail Session has been created successfully..");

        // Step3
        System.out.println("\n\n 3rd ===> Get Session and Send mail");
        Transport transport = getMailSession.getTransport("smtp");

        // Enter your correct gmail UserID and Password
        // if you have 2FA enabled then provide App Specific Password
        // itt állítod be, hogy honnan. email és jelszó is kell
        transport.connect("smtp.gmail.com", "javatestemail123456789", "anetta89");
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        transport.close();
    }

}