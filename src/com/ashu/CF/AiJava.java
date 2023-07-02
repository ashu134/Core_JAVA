package com.ashu.CF;

import java.util.Scanner;
    public class AiJava {

        public static void main(String[] args) {

            inputThenPrintSumAndAverage();

        }

        public static void inputThenPrintSumAndAverage(){

            Scanner sc= new Scanner(System.in);

            int counter =0;

            int sum=0;

            double avg=0;

            while (counter<5){

                System.out.print("Enter number #"+ (counter+1) +": ");

                boolean hasNextInt=sc.hasNextInt();

                if(hasNextInt){

                    int userinput= sc.nextInt();

                    counter++;

                    sum= sum+userinput;

                }else{

                    System.out.println("Invalid Value");

                }

                sc.nextLine();

            }

            if(counter>0){

                avg= (double) sum/ counter;

            }

            System.out.println("SUM = "+ sum + " AVG = " + avg);

        }
    }