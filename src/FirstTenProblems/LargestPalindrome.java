package FirstTenProblems;

public class LargestPalindrome {


    private static boolean isPalindrome(Integer n){
        String s = n.toString();
        int length = s.length();

        for (int i =0; i< length/2;i++){

            if(s.charAt(i) != s.charAt(length-1-i)){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {


        int n = 0;
        int a =0;
        int b = 0;

        for(int i=100; i <1000;i++){
            for(int j=i; j <1000;j++){
                Integer k = i * j;

                if(isPalindrome(k) && k>n){
                    n = k;
                    a = i;
                    b = j;
                }

            }
        }

        System.out.println(a+" x "+ b + "=" + n);





    }

}
