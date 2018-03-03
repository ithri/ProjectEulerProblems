package _10to20;

import util.EulerProjectProblemAbstract;

import java.math.BigDecimal;

public class _20_FactorialDigitSum extends EulerProjectProblemAbstract {

    public static void main(String[] args) {

        BigDecimal x = factorial(100);

        String str = x.toString();
        int sum = 0;
        for(int i=0; i< str.length();i++){
            sum = sum + Integer.parseInt(str.substring(i,i+1));
        }
        System.out.println(sum);

    }
}
