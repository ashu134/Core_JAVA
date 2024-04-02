package com.ashu.Aatest;

import java.util.Stack;

public class ExpressionEvaluate {
    public static void main(String[] args) {
        evaluate("(100+200)");
    }

    public static void evaluate(String str) {
        Stack<String> stack = new Stack<String>();
        Stack result = new Stack<>();
        int a;
        int b;
        String c = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') continue;
            stack.push(str.substring(i));
        }
        while (!stack.isEmpty()) {
            if (stack.pop() == ")") {
                a = Integer.parseInt(stack.pop());
                c = stack.pop();
                b = Integer.parseInt(stack.pop());
                if (c.equals("+")) {
                    result.push(a + b);
                }
                System.out.println(result.pop());
            }
        }
    }
}
