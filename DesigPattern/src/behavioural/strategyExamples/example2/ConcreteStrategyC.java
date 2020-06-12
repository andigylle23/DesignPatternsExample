package behavioural.strategyExamples.example2;

public class ConcreteStrategyC implements Strategy {
    @Override
    public void execute() {
        System.out.println("Called ConcreteStrategyC.execute()");
    }
}
