package behavioural.mediatorExamples.example2;

public interface ChatMediator {
    public void sendMessage(String message, Users contacts);
    public void addContact(Users contacts);
}
