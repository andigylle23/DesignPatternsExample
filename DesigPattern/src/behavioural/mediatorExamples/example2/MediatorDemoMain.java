package behavioural.mediatorExamples.example2;

import java.util.Date;

public class MediatorDemoMain {
    public static void main(String[] args) {
        ChatMediator applicationMediator = new ChatMediatorImpl();
        UserImpl user1 = new UserImpl(applicationMediator, "User1");
        UserImpl user2 = new UserImpl(applicationMediator, "User2");
        UserImpl user3 = new UserImpl(applicationMediator, "User3");

        applicationMediator.addContact(user1);
        applicationMediator.addContact(user2);
        applicationMediator.addContact(user3);

        System.out.println(new Date().toString());
        user1.send("Hello All!");
    }
}
