package com.ashu.CF;

public class sumOfNumber {
    public static void main(String[] args) {
        int sum1 = 0;
        for (int i = 0; i <= 4; i++) {
            sum1 = sum1 + i;

        }
        System.out.println("Sum of number is " + sum1);

        System.out.println("sum = " + sumOdd(-4, 6));
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {

                return true;
            } else {

                return false;
            }

        } else {

            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if (start <= end && start > 0) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i) && isOdd(i)) {
                    for (int j = start; j <= end; j++) {
                        if (j % 2 != 0) {
                            sum = sum + j;
                        }

                    }
                    return sum;
                }

            }
            return -1;

        }
        return -1;
    }


}
