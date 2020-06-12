package behavioural.strategyExamples.example2;

public class StrategyPatternDemo2 {

    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.execute();

        context = new Context(new ConcreteStrategyB());
        context.execute();

        context = new Context(new ConcreteStrategyC());
        context.execute();


    }
}
