package behavioural.mediatorExamples.example2;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    private List<Users> contacts;

    public ChatMediatorImpl() {
        this.contacts = new ArrayList<>();
    }

    @Override
    public void addContact(Users contact) {
        this.contacts.add(contact);
    }

    @Override
    public void sendMessage(String message, Users contact) {
        for(Users con: this.contacts) {
            // message should not be sent to themselves
            if(con != contact) {
                con.receive(message);
            }
        }
    }
}
