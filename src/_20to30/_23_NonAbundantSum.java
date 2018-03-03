package _20to30;

import util.EulerProjectProblemAbstract;

import java.util.*;

public class _23_NonAbundantSum extends EulerProjectProblemAbstract {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        int nonabundantnumber = 0;

        for (int i =12; i<28124;i++){
            if(sumOfDivisors(i)>i){
                list.add(i);
            }
        }

        int len = list.size();

        Set<Integer> set = new HashSet<>();

        for(int j = 0; j< len; j++){
            for(int k = j;k <len;k++){
                int a = list.get(j)+list.get(k);
                if(a < 28124)
                    set.add(a);
            }
        }

        for(int j = 1; j< 28124; j++){
            if(!set.contains(j)){
                nonabundantnumber+= j;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(" Sum = " + nonabundantnumber);

        System.out.println(" duration = " + (end - start));
    }


}
