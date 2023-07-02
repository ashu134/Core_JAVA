package com.ashu.CF;

public class Pelindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
        System.out.println(sumFirstAndLastDigit(459));
        System.out.println(sumFirstAndLastDigit(4));

    }
    public static boolean isPalindrome (int number){
        int reservenum=number;
        int reverse=0;
        while (number !=0){
            int reminder =number%10;
            reverse= reverse*10+reminder;
            number=number/10;

        }
        if (reservenum==reverse){
            return true;
        }else{
            return false;
        }
    }
    public static int sumFirstAndLastDigit(int number) {
        int reverse = 0;
        int sum=0;
        int count=0;
        if (number < 0) {
            return -1;
        } else {
            while (number != 0) {
                count++;
                int reminder = number % 10;
                reverse = reverse * 10 + reminder;
                number = number / 10;
                if(count==1 && number == 0){
                    sum=2*reminder;
                }else if (count==1 || number == 0){
                    sum=sum+reminder;
                }
            }
        }
        return sum;
    }
}
