public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(0, 5, 4));
    }
    public static boolean canPack(int bigCount, int smallCount,int goal){
        //smallCount=1 kg
        //bigCount= 5kg
        if (bigCount<0||smallCount<0||goal<0){
            return false;
        }
        int total= smallCount+bigCount*5;
        if(total>=goal){
            if (total>goal){
                for(int i=0; i<=bigCount;i++){
                    //i=i+1;
                    int x=i*5;
                    for (int j=-0 ; j<=smallCount;j++) {
                        int y = x + j;

                        if (y < goal) {
                            continue;
                        } else if (y == goal) {
                            return true;
                        } //else {
                            //return false;
                        //}
                    }
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
        return false;
    }
}
