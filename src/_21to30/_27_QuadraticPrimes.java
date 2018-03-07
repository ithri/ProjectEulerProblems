package _21to30;// problem 27

import util.EulerProjectProblemAbstract;

public class _27_QuadraticPrimes extends EulerProjectProblemAbstract {


    public static void main (String[] args){
        int num = 10000;
        int a =0;
        int b =0;
        int max = 0;
        for (int i=-num-1;i< num;i++){
            for (int j= -num;j<=num;j++){
                int n=0;

                while(isPrime(n*n + i*n + j)){
                    n++;
                }
                if (n> max){
                    max = n;
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("n²+"+a+"n+"+ b);
        System.out.println("0<=n<="+max);
        System.out.println(a*b);
    }
}
