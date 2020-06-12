package behavioural.interpreterExamples.example2;

import java.util.ArrayList;
import java.util.Stack;

public class Parser {
    private ArrayList<Expression> parseTree = new ArrayList<Expression>();

    public Parser(String s) {
        for (String token : s.split(" ")) {
            if (token.equals("+")){
                parseTree.add(new TerminalExpressionPlus());
            } else if(token.equals("-")) {
                parseTree.add(new TerminalExpressionMinus());
            } else {
                parseTree.add(new TerminalExpressionNumber(Integer.valueOf(token)));
            }
        }
    }

    public int evaluate() {
        Stack<Integer> context = new Stack<Integer>();
        for (Expression expression: parseTree) {
            expression.interpret(context);
        }

        return context.pop();
    }
}
