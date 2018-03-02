package _0to10;

public class SmallestMultiple {

    private static boolean isGood(int m, int n ){

        for(int i=1;i<=n; i++){
            if(m % i != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int i = 2520;

        while(!isGood(i,20)){
            i++;
        }

        System.out.println("i = " + i);
    }

}
