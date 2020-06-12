package behavioural.strategyExamples.example2;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Called ConcreteStrategyA.execute()");
    }
}
