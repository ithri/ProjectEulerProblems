package TenTo20;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargeSum {

    public static void main(String[] args){

        String fileName = "C://Users/ASUS/IdeaProjects/projectEulerProblems/src/files/problem13.txt";

        List<String> list = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            list = stream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int n = list.size();

        long[] matrix = new long[n];
        int j=0;
        for(String s : list){
            matrix[j] = Long.parseLong(s.substring(0,11));
            j++;
        }
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += matrix[i];
        }

        System.out.println(sum);


    }
}
