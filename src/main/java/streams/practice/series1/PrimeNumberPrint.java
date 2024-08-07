package streams.practice.series1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class PrimeNumberPrint {




    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 2,1, 5, 85, 10, 8, 5, 7, 11, 13);

        numbers.stream()
                .filter(PrimeNumberPrint::isPrime)//calls isPrime method
                .forEach(System.out::println);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }

}