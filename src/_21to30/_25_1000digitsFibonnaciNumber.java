package _21to30;

import java.math.BigDecimal;

public class _25_1000digitsFibonnaciNumber {

    public static void main(String[] args) {

        int n = 1000;  // 1000 digits

        BigDecimal res = new BigDecimal(1);

        BigDecimal limit = new BigDecimal(10).pow(n-1);

        BigDecimal n1 = new BigDecimal(1);
        BigDecimal n2 = new BigDecimal(1);

        int i = 2;
        while (limit.compareTo(res)>0) {
            res = n1.add(n2);
            n1 = n2;
            n2 = res;
            i++;
        }

        System.out.println(i); // -> 4782
    }

}
