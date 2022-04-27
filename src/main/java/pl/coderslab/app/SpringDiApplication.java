package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld"); //  helloWorld to identyfikator id z beans a nie message
//      HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class); //- aleternatywnie
        helloWorld.printMessage();

        EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.send();

        MessageSender messageSender = context.getBean("messageSender", MessageSender.class);
        messageSender.sendMessage();
        messageSender.sendMessageFromProperty();

        context.close();
    }
}
