package kata.kyu4;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReversePolishNotationCalculator {
    public double evaluate(String expr) {
        if (expr.isEmpty()) return 0d;
        Deque<String> stack = new ArrayDeque<>();
        String[] sArray = expr.split(" ");
        for (int i = 0; i < sArray.length; i++) {
            String ch = sArray[i];
            if (ch.matches("\\+")) {
                String b = stack.pop();
                String a = stack.pop();
                int s = Integer.valueOf(a) + Integer.valueOf(b);
                stack.push(String.valueOf(s));
            } else if (ch.matches("\\-")) {
                String b = stack.pop();
                String a = stack.pop();
                int s = Integer.valueOf(a) - Integer.valueOf(b);
                stack.push(String.valueOf(s));
            } else if (ch.matches("\\*")) {
                String b = stack.pop();
                String a = stack.pop();
                int s = Integer.valueOf(a) * Integer.valueOf(b);
                stack.push(String.valueOf(s));
            } else if (ch.matches("\\/")) {
                String b = stack.pop();
                String a = stack.pop();
                int s = Integer.valueOf(a) / Integer.valueOf(b);
                stack.push(String.valueOf(s));
            } else {
                stack.push(ch);
            }
        }

        return Double.valueOf(stack.pop());
    }
}
