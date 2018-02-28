import java.io.CharArrayReader;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class PrimeDigitReplacements extends EulerProjectProblemAbstract{

    public static void main(String[] args) {


        for(int i= 10; i<999;i++){

            if(has2SimilarDigits(i) && isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static Integer replace2Digits(Integer a){
        Integer res = a;

        return a;
    }

    private static Set getIndexes(Integer a){
        Set<Integer> res = new TreeSet<>();

        String str = a.toString();

        for(int i=0;i< str.length();i++){
            if(str.indexOf(str.charAt(i)) != i){

            }
        }


        return res;
    }

    private static boolean has2SimilarDigits(Integer a){

        String str = a.toString();

        for(int i=0;i< str.length();i++){
            if(str.indexOf(str.charAt(i)) != i){
                return true;
            }
        }
        return false;
    }
}
