package _1to10;

import java.util.stream.IntStream;

public class Prime10001st {


    private static  boolean isPrime(int number) {
        return number > 2
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

    public static void main(String[] args) {

        int number = 10001;
        int n =1;
        int i =1;
        while(i< number){
            n= n+2;
            if(isPrime(n)){
                i++;
            }
        }
        System.out.println(n+ " est le nombre premier numero "+ number );

    }
}
