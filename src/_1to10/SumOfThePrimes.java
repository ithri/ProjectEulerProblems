package _1to10;

import java.util.stream.LongStream;

public class SumOfThePrimes {

    private static  boolean isPrime(long number) {
        return number > 2
                && LongStream.rangeClosed(2, (long) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

    public static void main (String args[]) {

        long number = 2000000;

        long sum = 2;
        for(long i =3;i< number;i+=2){
            if(isPrime(i)){
                sum += i;
            }
        }
    System.out.println("=" +sum);

    }
}
