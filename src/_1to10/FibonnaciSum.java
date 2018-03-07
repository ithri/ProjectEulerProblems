package _1to10;

public class FibonnaciSum {


    private static Integer fiboSum(Integer max){


        Integer sum =2;
        Integer j = 3;
        Integer i = 2;

        while(j < max){
            if(j % 2 ==0)
            sum +=j;

            Integer k = i;
            i = j;
            j = k+j;
        }

        return sum;
    }

    public static void main (String args[]){

        System.out.println( fiboSum(4000000));
    }
}
