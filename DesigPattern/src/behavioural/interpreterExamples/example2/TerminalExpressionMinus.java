package behavioural.interpreterExamples.example2;

import java.util.Stack;

public class TerminalExpressionMinus implements Expression {
    public void interpret(Stack<Integer> s) {
        s.push( - s.pop() + s.pop());
    }
}
