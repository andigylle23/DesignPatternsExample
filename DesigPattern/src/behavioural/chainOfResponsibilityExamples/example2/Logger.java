package behavioural.chainOfResponsibilityExamples.example2;

public abstract class Logger {
    public static final int ERROR = 3;
    public static final int NOTICE = 5;
    public static final int DEBUG = 7;
    private final int mask;
    protected Logger(int mask) { this.mask = mask; }

    // The next element in the chain of responsibility
    protected Logger next;
    public Logger setNext(Logger l) {
        next = l;
        return this;
    }

    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);

            if (next != null) {
                next.message(msg, priority);
            }
        }
    }

    abstract protected void writeMessage(String msg);
}
