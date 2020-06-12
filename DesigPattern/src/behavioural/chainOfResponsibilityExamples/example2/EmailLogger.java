package behavioural.chainOfResponsibilityExamples.example2;

public class EmailLogger extends Logger {
    public EmailLogger(int mask) { super(mask); }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sending via email: " + msg);
    }
}
