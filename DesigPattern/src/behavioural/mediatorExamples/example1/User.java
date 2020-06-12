package behavioural.mediatorExamples.example1;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
