package _1to10;

public class GreatestPrimeFactor {


    public static void main(String[] args) {

            long number=600851475143L;

            for(long i=2;i<number ;i++)
            {
                while(number % i==0)
                {
                    number=number/i;

                }

            }
            System.out.println(number);


    }
}
