package behavioural.stateExamples.example2;

public class StatePatternDemo {

    public static void main(String[] args) {
        StateContext stateContext = new StateContext();

        stateContext.writeStateName("Monday");
        stateContext.writeStateName("Tuesday");
        stateContext.writeStateName("Wednesday");
        stateContext.writeStateName("Thursday");
        stateContext.writeStateName("Friday");
        stateContext.writeStateName("Saturday");
        stateContext.writeStateName("Sunday");

    }
}
