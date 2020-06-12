package behavioural.interpreterExamples.example2;

import java.util.Stack;

public interface Expression {
    public void interpret(Stack<Integer> s);
}
