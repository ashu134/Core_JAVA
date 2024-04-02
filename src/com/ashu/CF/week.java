package com.ashu.CF;

public class week {
    public static void main(String[] args) {
        printdayofweek(9);
        printdayofweek(2);
        printNumberInWord(1);
    }

    public static void printdayofweek(int day) {
        String daysofWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> {
                yield "Monday";
            }
            case 2 -> {
                yield "Tuesday";
            }
            case 3 -> {
                yield "wednesday";
            }
            case 4 -> {
                yield "Thursday";
            }
            case 5 -> {
                yield "Friday";
            }
            case 6 -> {
                yield "Saturday";
            }
            default -> "Not valid Day";
        };
        System.out.println(day + " stands for " + daysofWeek);
    }

    public static void printNumberInWord(int number) {
        String NumberInWord = switch (number) {
            case 0 -> {
                yield "ZERO";
            }
            case 1 -> {
                yield "ONE";
            }
            case 2 -> {
                yield "TWO";
            }
            case 3 -> {
                yield "THREE";
            }
            case 4 -> {
                yield "FOUR";
            }
            case 5 -> {
                yield "FIVE";
            }
            case 6 -> {
                yield "SIX";
            }
            case 7 -> {
                yield "SEVEN";
            }
            case 8 -> {
                yield "EIGHT";
            }
            case 9 -> {
                yield "NINE";
            }
            default -> "OTHER";
        };
        System.out.println(NumberInWord);
    }
}
