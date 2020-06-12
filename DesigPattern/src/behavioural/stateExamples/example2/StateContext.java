package behavioural.stateExamples.example2;

public class StateContext {
    private State myState;

    public StateContext() {
        setState(new StateA());
    }

    public void setState(State newState) {
        this.myState = newState;
    }
    public void writeStateName(String name) {
        this.myState.writeName(this, name);
    }
}
