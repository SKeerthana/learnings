import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalPracticeProblems {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 8, 4, 6);

        System.out.println("Prime numbers -> " + findPrimeNumbers(numbers));

        //find the double of smallest even number greater than 3
        Optional<Integer> result = numbers.stream()
            .sorted()
            .filter(number -> number > 3)
            .filter(number -> number % 2 == 0)
            .map(number -> number * 2)
            .findFirst();

        if(result.isPresent())
            System.out.println(result.get());
    }

    private static List<Integer> findPrimeNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(FunctionalPracticeProblems::isPrime)
                .collect(Collectors.toList());
    }

    private static boolean isPrime(Integer number) {
        return number > 1 && IntStream.range(2, number).noneMatch(divisor -> number % divisor == 0);
    }

}
