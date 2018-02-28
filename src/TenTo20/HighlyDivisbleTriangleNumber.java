package TenTo20;

public class HighlyDivisbleTriangleNumber {
    public static void main(String[] args){
        int i = 1;
        int number=0;
        boolean cond = false;
        while (!cond){
            number = number + i;
            i++;
            if(nbDivisorsOverThan(number)){
                cond =  true;
            }
        }
        System.out.println(number);
    }
    private static boolean nbDivisorsOverThan(int n){
        int nb = 2;
        long sqrt = Math.round(Math.sqrt(n));
        for(int i=2;i<sqrt;i++){
            if(n % i ==0){
                nb =nb+2;
            }
            if(sqrt * sqrt == n)
                nb--;
        }
        return nb>=500;
    }
}