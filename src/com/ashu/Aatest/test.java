package com.ashu.Aatest;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //System.out.println(readElements(readInteger()));
        System.out.println(readInteger());
    }

    private static int readInteger() {
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        try {
            x = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.nextLine(); // Consume the invalid input
        }
        return x;
    }

    private static int[] readElements(int count) {
        int[] elements = new int[count];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + count + " elements:");

        for (int i = 0; i < count; i++) {
            try {
                elements[i] = scanner.nextInt();
                // Exit the loop if valid input is received
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // Consume the invalid input
            }
        }
        return elements;
    }
}
