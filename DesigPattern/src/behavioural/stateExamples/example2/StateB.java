package behavioural.stateExamples.example2;

public class StateB implements State {
    private int count = 0;

    @Override
    public void writeName(StateContext stateContext, String name) {
        System.out.println(name.toLowerCase());
        if(count++ > 1) {
            stateContext.setState(new StateA());
        }
    }
}
