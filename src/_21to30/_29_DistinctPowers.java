package _21to30;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


/*
Python solution

a = set()
i = 2
while i <= 100:
    j = 2
    while j <= 100:
        a.add(i**j)
        j = j+1
    i = i + 1

print(len(a))
 */
public class _29_DistinctPowers {

    public static void main(String[] args) {

        Set<BigDecimal> set = new HashSet<>();

        for (int i=2;i<=100; i++){
            for (int j=2;j<=100; j++){
                set.add(new BigDecimal(Math.pow((double)i, (double)j)));
            }
        }
        System.out.println(set.size());
    }
}
