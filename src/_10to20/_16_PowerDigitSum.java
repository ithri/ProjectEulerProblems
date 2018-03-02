package _10to20;

import java.math.BigDecimal;

public class _16_PowerDigitSum {


    public static void main(String[] args){
        BigDecimal x = new BigDecimal(Math.pow(2,1000));

        String str = x.toString();
        int sum = 0;
        for(int i=0; i< str.length();i++){
            sum = sum + Integer.parseInt(str.substring(i,i+1));
        }
        System.out.println(sum);
    }
}