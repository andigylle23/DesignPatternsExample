package behavioural.momentoExamples.example2;

public class MementoExample {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Originator originator = new Originator();
        originator.setState("State 1");
        originator.setState("State 2");
        careTaker.addMemento(originator.saveToMemento());

        originator.setState("State 3");
        careTaker.addMemento(originator.saveToMemento());

        originator.setState("State 4");
        originator.restoreFromMemento(careTaker.getMemento(1));

    }
}
