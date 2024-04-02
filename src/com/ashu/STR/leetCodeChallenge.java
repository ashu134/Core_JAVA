package com.ashu.STR;

import java.beans.Introspector;

public class leetCodeChallenge {
    public static boolean isValidAbbreviation(String s1, String s2) {
        // i points to locations in s1, and j points to locations in s2
        int i = 0, j = 0, sum = 0, counts1 = 0;
        for (int k = 0; k < s1.length(); ) {
            if (!Character.isDigit(s1.charAt(k))) {
                k++;
                counts1++;
            } else if (Character.isDigit(s1.charAt(k))) {
                // If we find a digit, find the full number (as it might have more than one digit)
                int start = k;
                while (k < s1.length() && Character.isDigit(s1.charAt(k))) {
                    k++;
                }
                int total = Integer.parseInt(s1.substring(start, k));
                if (total > 40) {
                    for (int a = start; a < k; a++) {
                        counts1 += (Integer.parseInt(s1.substring(a, a + 1)));
                    }
                } else {
                    counts1 += total;
                }
            }
        }
        System.out.println(counts1);

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                // Characters match, move both pointers
                i++;
                j++;
            } else if (Character.isDigit(s2.charAt(j))) {
                // If we find a digit, find the full number (as it might have more than one digit)
                int start = j;
                while (j < s2.length() && Character.isDigit(s2.charAt(j))) {
                    j++;
                }
                // Extract the number from s2 and move i accordingly
                int num = Integer.parseInt(s2.substring(start, j));
                if (num > 40) {

                    sum = (Integer.parseInt(s2.substring(start, start + 1)) + Integer.parseInt(String.valueOf(s2.charAt(j - 1))));
                    i += sum;
                } else {
                    i += num;
                }
            } else {
                // If characters do not match and s2 does not have a digit, return false
                return false;
            }

            //Start

            //END
        }

        // Ensure we've reached the end of both strings, considering possible trailing numbers in s2
        if (i == s1.length() && j == s2.length()) {
            return true;
        } else if (i == s1.length() && j < s2.length() && Character.isDigit(s2.charAt(j))) {
            int remainingNum = 0;
            while (j < s2.length()) {
                if (Character.isDigit(s2.charAt(j))) {
                    remainingNum = remainingNum * 10 + (s2.charAt(j) - '0');
                    j++;
                } else {
                    return false; // Unexpected character
                }
            }
            // Check if the remaining number matches the leftover length of s1
            return i + remainingNum == s1.length();
        } else if (counts1 == i) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "l123e";
        String s2 = "44";
        String s3 = "a7h";
        String s4 = "a8";

        System.out.println(isValidAbbreviation(s1, s2));
        System.out.println(isValidAbbreviation(s3, s4));
    }

}
