package com.ashu.GENR;

public class Comparable {
    public static void main(String[] args) {


        Integer one = 4;
        Integer[] other = {1, 2, 3, 5, 4, 5, 7};
        for (var x : other) {
            int val = one.compareTo(x);
            System.out.printf("%d %s %d: compareTo=%d%n", one,
                    (val == 0 ? "==" : (val < 0) ? "<" : ">"), x, val);
        }
    }
}