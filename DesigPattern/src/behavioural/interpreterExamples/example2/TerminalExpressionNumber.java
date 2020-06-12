package behavioural.interpreterExamples.example2;

import java.util.Stack;

public class TerminalExpressionNumber implements Expression {
    private int number;
    public TerminalExpressionNumber(int number) {
        this.number = number;
    }
    public void interpret(Stack<Integer> s) {
        s.push(number);
    }
}
