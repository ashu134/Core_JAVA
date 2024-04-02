package com.ashu.Aatest;

import java.util.Stack;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        String input = "(10*-(10/5))";
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
                    applyOperatortest(operandStack, operatorStack.pop());
                }
                operatorStack.pop(); // Remove the opening parenthesis
            } else {
                // Operator
                while (!operatorStack.isEmpty() && getPrecedence(c) <= getPrecedence(operatorStack.peek())) {
                    applyOperatortest(operandStack, operatorStack.pop());
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            applyOperatortest(operandStack, operatorStack.pop());
        }

        return Double.parseDouble(operandStack.pop());
    }

    private static void applyOperator(Stack<String> operandStack, char operator) {
        double secondOperand = Double.parseDouble(operandStack.pop());
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

    private static void applyOperatortest(Stack<String> operandStack, char operator) {
        double secondOperand = Double.parseDouble(operandStack.pop());
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
}