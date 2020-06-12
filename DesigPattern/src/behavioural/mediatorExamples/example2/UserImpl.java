package behavioural.mediatorExamples.example2;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Date;

public class UserImpl extends Users {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println("Incoming message from: " + this.name);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + ": " + message);
    }
}
