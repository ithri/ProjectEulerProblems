package FirstTenProblems;

import java.sql.Timestamp;

public class PythagorianTriplet {


    public static void main (String args[]) {

        long startTime = System.currentTimeMillis();
        int n = 1000;
        int a=0;
        int b = 0;
        int c = 0;


        for(int i = 1; i<n/2;i++){
            for(int j = i; j<n/2;j++){
                for(int k = i; k<n;k++){
                    if(i+j+k > n){
                        break;
                    }else if(i+j+k == n && i*i + j*j == k*k){

                            a =i;
                            b= j;
                            c = k;
                            break;

                    }
                }
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println(a+" x "+b+" x "+c + " = " + a*b*c);
        System.out.println(endTime - startTime);
    }
}
