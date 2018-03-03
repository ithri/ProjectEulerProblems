package _20to30;

import util.EulerProjectProblemAbstract;

public class _21_AmicableNumbers extends EulerProjectProblemAbstract {

    public static void main(String[] args) {

        int sum = 0;

        for(int i=1; i<10000;i++){
            int r = sumOfDivisors(i);

            if(sumOfDivisors(r) == i && r !=i){
                System.out.println("d("+i +") = " + r);
                sum+=i;
            }
        }

        System.out.println("sum of all amicable numbers = " +sum);
    }

}
