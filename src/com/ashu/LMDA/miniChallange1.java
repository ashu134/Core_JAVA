package com.ashu.LMDA;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class miniChallange1 {
    public static void main(String[] args) {
        Consumer<String> printWords = new Consumer<>() {
            @Override
            public void accept(String sentences) {
                String[] parts = sentences.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordsLamda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
        printWords.accept("I am Aashutosh kumar from Bihar");
        printWordsLamda.accept("i am aashutosh kumar working in Bangalore");

        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };
        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };
        printWordsForEach.accept("working with lamda function ");
        printWordsConcise.accept("working with lamda function - concise");
//==============================================================
        Function<String, String> everySecondChar = source -> {
            StringBuilder returnval = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnval.append(source.charAt(i));
                }
            }
            return returnval.toString();
        };
        System.out.println(everySecondChar.apply("12345432"));
    }

    public static String everySecondChar(String source) {
        StringBuilder returnval = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnval.append(source.charAt(i));
            }
        }
        return returnval.toString();
    }
//===================================================
}
