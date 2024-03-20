package com.ashu.DSA.Test;

import java.util.Stack;

public class Paranthesiscompare {
    public boolean isParanthesisBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char top = stack.pop();
                if (ch == ')' && top!= '(') {
                    return false;
                } else if (ch == '}' && top!= '{') {
                    return false;
                } else if (ch == ']' && top!= '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
