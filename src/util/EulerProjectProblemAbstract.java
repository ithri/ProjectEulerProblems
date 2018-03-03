package util;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public abstract class EulerProjectProblemAbstract {

    protected static boolean isPrime(int number) {
        return number > 2
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }


    protected static List<String> getListFromFile(String path){
        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(path))) {
            list = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }


    protected static BigDecimal factorial (int n){

        BigDecimal bd = new BigDecimal(1);

        for (int i =2;i<=n;i++){
           bd = bd.multiply(new BigDecimal(i));
        }
        return bd;
    }

    protected static int sumOfDivisors(int n){
        int res = 0;
        for(int i=1;i<=n/2; i++){
            if(n%i ==0){
                res+=i;
            }
        }
        return res;
    }

}
