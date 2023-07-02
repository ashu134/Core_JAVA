public class LargestPrime {
    public static void main(String[] args) {
        //System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(16));

    }
    public static int getLargestPrime (int number){
        if (number<0){
            return -1;
        }else{
            //if(number)
            for (int i=((number/2)-1);i>2;i--){
                if (number%i==0) {
                    for (int j = ((i-1)); j>=2; j--) {
                        if (i % j != 0 && number%j==0) {
                            return j;
                        }
                    }
                }

            }
            return number;
        }
        //return -1;
    }
}
