package com.ashu.CF;

public class numbeToWord {
    public static void main(String[] args) {
        getDigitCount(0);

        //numberToWords(11670000);
    }
    public static void numberToWords (int number){
        int k=reverse(number);
        int count=0;
        if (k<0){
            System.out.println( "Invalid Value");
        }else{
            while(k !=0){
                int r= k%10;
                k=k/10;
                count=count+1;
                int count1=getDigitCount(number);
                if (r==0){
                    System.out.println("Zero");
                    continue;
                }else if (r==1){
                    System.out.println("One");
                    continue;
                }else if (r==2){
                    System.out.println("Two");
                    continue;
                }else if (r==3){
                    System.out.println("Three");
                    continue;
                }else if (r==4){
                    System.out.println("Four");
                    continue;
                }else if (r==5){
                    System.out.println("Five");
                    continue;
                }else if (r==6){
                    System.out.println("Six");
                    continue;
                }else if (r==7){
                    System.out.println("Seven");
                    continue;
                }else if (r==8){
                    System.out.println("Eight");
                    continue;
                }else if (r==9){
                    System.out.println("Nine");
                    continue;
                }
            }
        }
        int count1= getDigitCount(number);
         if (count!=count1){
            for(int j=1; j<=(count1-count);j++){
                System.out.println("Zero");
            }
        }
    }
    public static int reverse(int number){
        int rev=0;
        while(number!=0){
            int rem= number%10;
            rev= rev*10+rem;
            number=number/10;
        }
        //numberToWords(rev);
        return rev;

    }

    public static int getDigitCount (int number){
        int i=0;
        if (number<0){
            return -1;
        }else{
            while(number != 0){
                int rem=number%10;
                i=i+1;
                number=number/10;
            }
        }
        return i;
    }

}
