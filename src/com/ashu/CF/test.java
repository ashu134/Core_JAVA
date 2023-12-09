package com.ashu.CF;

import com.ashu.EMP.*;
import com.ashu.OOPS.*;

import java.math.BigInteger;

public class test {
    Account account= new Account("012",100.4,"Amar kumar","amar1234@gmail.com","9098787878");

    public Account getAccount() {
        return account;
    }

    public static void main(String[] args) {
        System.out.println("Testing");
        double num1 = 10.5;
        test test= new test();
        int num2 = (int) num1; // Explicit casting from double to int
        System.out.println(num2); // Output: 10
        BigInteger number = BigInteger.valueOf(999999);
        String strNumber = String.valueOf(number);
        System.out.println(strNumber); // Output: "10"
        calcultor(true,100,4,500);

        //Calling Account class from OOPS package
        Account account1= new
                Account("110",100.11,"Raj kumar","rajkumar567@gmail.com","9090909090");
        System.out.println(account1);
        System.out.println(test.getAccount());
    }

    public static void calcultor(boolean gameover, int score, int levelCompleted, int bonus){
        gameover=true;
        score=100;
        levelCompleted= 12;
        bonus= 100;
        int finlScore=score;
        if(gameover){
            finlScore = finlScore+(levelCompleted*bonus);
            finlScore= finlScore+1000;
            System.out.println("your final Score is "+ finlScore);
        }

    }
}
