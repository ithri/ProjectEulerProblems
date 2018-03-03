// problem 15
package _10to20;


/*
x>2
x => n = a*3 + b       a/b = 1/3 + 1/(3+3) +  1/(3+3+4)  + 1/(3+3+4+ ... + (x-1))
            (0 +

2 => 6 = 2 * 3 + 0   0
3 => 20 = 6 * 3 + 2    3   0,33         1/3
4 => 70 = 20 * 3 + 10   2  0,5          1/3 + 1/6
5 => 252 = 70 * 3 + 42  1,66  0,6       1/3 + 1/6 + 1/10
6 => 924 = 252 * 3 + 168   1,5   0,66   1/3 + 1/6 + 1/10 + 1/15
7 => 3432 = 924 * 3 + 660   1,4  0,71
8 => 12870 = 3432 * 3 + 2574  1,33 0,75
9 => 48620 = 12870 * 3 + 10010  1,28   0,77
10 => 184756
 */
public class _15_LatticePaths {

    public static void main(String[] args) {


        long n = 20;
        long result = 1;
        for (long i = 1;i <=n;i++){
            result = result * (n + i)/i;
        }




        System.out.println((long)nbPaths(20));
        System.out.println(result);


    }

    private static double nbPaths(double n){
        double res= 0;
        double b =6;

        for (int i =3; i<=n;i++){

            double a = b * rapport(i);

            res = b * 3 + a;
            b = res;
        }

        return res;
    }



    private static double sum(double x){
        double a = 3;
        for (double i=3;i < x; i++){
            a+=i;
        }

        return a;
    }
    private static double rapport(double i){

        if(i==3){
            return 1d/3d;
        }else{
            return rapport(i-1) + 1d/sum(i);
        }

    }


}
