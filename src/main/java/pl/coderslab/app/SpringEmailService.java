package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;

public class SpringEmailService {

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    EmailService emailService = (EmailService) context.getBean("emailService");
//        EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.send();
        context.close();
    }
}
