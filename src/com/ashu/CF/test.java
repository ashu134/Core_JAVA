import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        System.out.println("Testing");
        double num1 = 10.5;
        int num2 = (int) num1; // Explicit casting from double to int
        System.out.println(num2); // Output: 10


        BigInteger number = BigInteger.valueOf(999999);
        String strNumber = String.valueOf(number);
        System.out.println(strNumber); // Output: "10"
        calcultor(true,100,4,500);


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
