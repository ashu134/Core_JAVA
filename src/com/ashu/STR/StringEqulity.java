package com.ashu.STR;

public class StringEqulity {
    public static void main(String[] args) {
        String[] word1 = {"aa", "sh", "utos", "h"};
        String[] word2 = {"aa", "shu", "tos", "h"};
        System.out.println(EqualityCheck(word1, word2));
    }

    public static boolean EqualityCheck(String[] word1, String[] word2) {
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);
        System.out.println(str1 + " " + str2);
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }
}
