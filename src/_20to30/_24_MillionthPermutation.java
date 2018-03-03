package _20to30;

import util.EulerProjectProblemAbstract;

import java.math.BigDecimal;
import java.util.*;

/**
 * Nombre de possibilité = n! (n = nombre de caractères)
 */
public class _24_MillionthPermutation extends EulerProjectProblemAbstract {

    private static List<Integer[]> list = new ArrayList<>();

    public static void main(String[] args) {

        String s = "0123456789";

        int idx = 1000000;

        System.out.println(nFactOf(idx));

        int size = list.size();
        for (int i=0;i< size;i++){
            Integer[] elm = list.get(i);
            int len = s.length() - 1;

            String n = s.substring(0,len-elm[0]);
            String a = s.substring(len-elm[0]);

            if(i+1 < size){
                s = n+ a.substring(elm[1], elm[1]+1) + a.substring(0,elm[1]) + a.substring(elm[1]+1);
            }else{
                s = n+ a.substring(elm[1]-1, elm[1]) +  a.substring(0,elm[1]-1) + a.substring(elm[1]) ;

                s = s.substring(0,len-elm[1]+1) + new StringBuilder( s.substring(len-elm[1]+1)).reverse().toString() ;

            }
        }
            System.out.println(s);  //   -> 2783915460
    }


    private static String nFactOf( int idx){

        if(idx == 1) {
           list.add(new Integer[]{1,1});
            return "1";
        }
        int i = 0;
        String res = "";

        while(i<idx){
            i++;
            BigDecimal[] b = factorial(i).divideAndRemainder(new BigDecimal(idx));

            if(b[0].intValue() == 1 && b[1].intValue() == 0){
                list.add(new Integer[]{i,b[0].intValue()});

                return(b[0].intValue() + "x" + i + "!");
            }else{
                if(b[0].intValue() > 0){
                    BigDecimal[] b1 = new BigDecimal(idx).divideAndRemainder(factorial(i-1));
                    res = b1[0]+ "x" +(i-1) + "!";

                    list.add(new Integer[]{i-1,b1[0].intValue() });

                    if (b1[1].intValue() == 0){
                        return res;
                    }
                    return res + " + " +  nFactOf(b1[1].intValue());
                }
            }
        }
        return res;
    }
}
