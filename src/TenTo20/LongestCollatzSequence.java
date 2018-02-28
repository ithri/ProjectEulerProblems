package TenTo20;

import java.util.HashMap;

public class LongestCollatzSequence {
    private static HashMap<Long,Long> map = new HashMap<>();

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        long n = 0;
        long i = 12;
        long max =1;
        long sol = 1;
        while (i < 1000000) {
            i++;
            long num = i;

            n = seqLength(num);
            if (n> max){
                max = n;
                sol = i;
            }
        }

        System.out.println(sol + " | " + n);
    }

    private static long seqLength(long i) {
        long n = 1;
        long num = i;

        while (num != 1) {
            if (num % 2 == 0) {
                double d = log2((double)i);

                if(d % 1 == 0){
                    n= n+ ((long)d);
                    break;
                }else{
                    num =  num / 2;
                }

            } else {
                num =3 * num + 1;
            }

            Long t = map.get(num);
            if(t != null){
                n =  n+t;
                break;
            }
            else
                n++;
        }

        map.put(i, n);

        return n;


    }



    private static double log2(double a){

        return Math.log(a)/Math.log(2);
    }
}
