package com.ashu.OOPS;

public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(23.45);
        sc.setSecondNumber(76.89);
        System.out.println("add= " + sc.getAdditionResult());
        System.out.println("multiply= " + sc.getMultiplicationResult());
        System.out.println("divide= " + sc.getDivisionResult());
    }

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        System.out.println("add= " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            return 0;
        }
    }
}