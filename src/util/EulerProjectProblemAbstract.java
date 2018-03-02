package util;

import java.io.IOException;
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

}
