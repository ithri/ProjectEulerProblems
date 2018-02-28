import java.util.stream.IntStream;

abstract class EulerProjectProblemAbstract {

    static boolean isPrime(int number) {
        return number > 2
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

}
