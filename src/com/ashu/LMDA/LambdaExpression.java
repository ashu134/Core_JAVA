package com.ashu.LMDA;

import java.util.ArrayList;
import java.util.List;

import java.util.function.BinaryOperator;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(List.of(
            "India","Africa","Nepal","BanglaDesh","Burma"
        ));
        List<String> cities= new ArrayList<>(List.of(
                "PATNA","DELHI","BENGALURU","CHENNAI","MUMBAI"
        ));
        for(var x: list){
            System.out.println(x);
        }
        System.out.println("-----------------");
        list.forEach((s) -> System.out.println(s)); //LAMBDA expression
//        System.out.println("-----------------");
//        list.forEach(System.out::println);
        System.out.println("-----------------");
        cities.forEach(System.out::println);
        System.out.println("-----------------");
        //We can use Local variable in Lambda expression
        String ourCity ="Indian City ";
        cities.forEach((var city) -> {
            char first= city.charAt(0);
            System.out.println(ourCity+" "+city + " can be callead as "+ first);
        });
        //We can use multiple datatype with var in same calclator method
        int result= calculator((a,b) -> a+b,1,4);
        var result1 = calculator((a,b)->a/b,10,4);
        var result2 = calculator((a,b)-> a.toUpperCase()+" "+b.toUpperCase(),
                "aashutosh","Kumar");

        var result3 = calculator1((a,b)-> a.toUpperCase()+" "+b.toUpperCase(),
                "aashutosh","Kumar");
    }

    public static <T> T calculator(Operations<T> function,T value1,T value2){
        T result = function.operate(value1,value2);
        System.out.println("Result of the Operation is: "+result);
        return result;
    }
    public static <T> T calculator1(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1,value2);
        System.out.println("Result of the Operation is: "+result);
        return result;
    }


}

