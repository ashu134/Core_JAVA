package com.ashu.Aatest;

import java.util.*;

public class Evaluation {

    public static void main(String[] args) {

        String input = "(10*(10/5+3))";
        System.out.println(evaluateExpression(input));
    }

    public static double evaluateExpression(String expression) {
        Stack<String> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (Character.isDigit(c) || c == '.') {
                int start = i;
                while (i + 1 < expression.length() &&
                        (Character.isDigit(expression.charAt(i + 1)) || expression.charAt(i + 1) == '.')) {
                    i++;
                }
                operandStack.push(expression.substring(start, i + 1));
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    applyOperator(operandStack, operatorStack.pop());
                }
                operatorStack.pop(); // Remove the opening parenthesis
            } else {
                // Operator
                if (operatorStack.isEmpty() || operatorStack.peek() == '(') {
                    operatorStack.push(c);
                } else {
                    char topOperator = operatorStack.pop();
                    if (getPrecedence(c) > getPrecedence(topOperator)) {
                        operatorStack.push(topOperator);
                        operatorStack.push(c);
                    } else {
                        applyOperator(operandStack, topOperator);
                        operatorStack.push(c);
                    }
                }
            }
        }

        while (!operatorStack.isEmpty()) {
            if (operatorStack.peek() == '(') {
                throw new RuntimeException("Invalid expression: closing parenthesis");
            }
            applyOperator(operandStack, operatorStack.pop());
        }

        return Double.parseDouble(operandStack.pop());
    }

    private static void applyOperator(Stack<String> operandStack, char operator) {
        double secondOperand;
        if (operator == '-' && operandStack.size() >= 2) {
            String topOperand = operandStack.pop();
            if (topOperand.startsWith("-")) {
                secondOperand = Double.parseDouble(topOperand.substring(1));
            } else {
                secondOperand = Double.parseDouble(topOperand);
            }
        } else {
            secondOperand = Double.parseDouble(operandStack.pop());
        }

        double firstOperand = Double.parseDouble(operandStack.pop());

        switch (operator) {
            case '+':
                operandStack.push(String.valueOf(firstOperand + secondOperand));
                break;
            case '-':
                operandStack.push(String.valueOf(firstOperand - secondOperand));
                break;
            case '*':
                operandStack.push(String.valueOf(firstOperand * secondOperand));
                break;
            case '/':
                operandStack.push(String.valueOf(firstOperand / secondOperand));
                break;
            default:
                throw new RuntimeException("Invalid operator: " + operator);
        }
    }

    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                throw new RuntimeException("Invalid operator: " + operator);
        }
    }
}