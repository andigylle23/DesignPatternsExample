package behavioural.strategyExamples.example2;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("Called a ConcreteStrategyB.execute()");
    }
}
