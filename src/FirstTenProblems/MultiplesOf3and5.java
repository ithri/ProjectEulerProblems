package FirstTenProblems;

public class MultiplesOf3and5 {



    private static Integer sumof3And5Multiples (){
        Integer sum = 0;
        for(int i=3;i<1000;i++){
            if(i % 3 ==0 ||i%5==0){
                System.out.print(i+" | ");
                sum += i;
            }

        }

        return sum;
    }

    public static void main (String args[]){
        System.out.println("");
        System.out.println(sumof3And5Multiples());
    }
}
