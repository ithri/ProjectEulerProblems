package FirstTenProblems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumSquareDifference {

    public static void main(String[] args) {

        int sumOfSquares = Arrays.stream(IntStream.range(1, 101).toArray())
                .map(n -> n*n)
                .sum();


        int squareOfSum = Arrays.stream(IntStream.range(1, 101).toArray())
                .sum();

        squareOfSum= squareOfSum*squareOfSum;

        System.out.println(squareOfSum - sumOfSquares);
    }
}
