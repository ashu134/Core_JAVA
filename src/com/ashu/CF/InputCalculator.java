package com.ashu.CF;

import java.math.BigDecimal;
import java.util.Scanner;


public class InputCalculator {
    public static void main(String[] args) {
        InputCalculator ical = new InputCalculator();
        ical.inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        //System.out.print("input your integer : ");
        // int userinput= sc.nextInt();
        int counter = 0;
        int sum = 0;
        double avg = 0;
        int avg1 = 0;
        BigDecimal avg2 = BigDecimal.valueOf(0);
        while (counter < 8) {
            //System.out.print("input your integer : ");
            String userinput = sc.nextLine();
            try {
                int number = Integer.parseInt(userinput);
                counter++;
                sum = sum + number;
                avg = (float) sum / counter;
                avg1 = (int) Math.round(avg);
                avg2 = BigDecimal.valueOf(avg1);
            } catch (NumberFormatException nfe) {
                break;
            }
            //System.out.println("SUM = "+ sum + " AVG = " +avg1);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg2);

    }
}
