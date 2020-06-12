package behavioural.interpreterExamples.example2;

public class InterpreterPatternDemo {
    public static void main(String[] args) {
        String expression = "42 4 2 - +";
        Parser parser = new Parser(expression);
        System.out.println("'" + expression + "' equals " + parser.evaluate());
    }
}
