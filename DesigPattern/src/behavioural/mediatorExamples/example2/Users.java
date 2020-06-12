package behavioural.mediatorExamples.example2;

public abstract  class Users {
    protected ChatMediator mediator;
    protected String name;

    public Users(ChatMediator mediator, String name) {
       this.mediator = mediator;
       this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
