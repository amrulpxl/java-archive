import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> evenSquares = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println("even squares: " + evenSquares);
        
        int sum = numbers.stream()
            .reduce(0, Integer::sum);
        System.out.println("sum: " + sum);
        
        List<String> words = Arrays.asList("hello", "world", "java", "streams");
        List<String> caps = words.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println("uppercase: " + caps);
        
        IntStream.rangeClosed(1, 5)
            .mapToObj(i -> "number " + i)
            .forEach(System.out::println);
        
        boolean allEven = numbers.stream()
            .allMatch(n -> n % 2 == 0);
        boolean anyEven = numbers.stream()
            .anyMatch(n -> n % 2 == 0);
        System.out.println("all even? " + allEven);
        System.out.println("any even? " + anyEven);
    }
}
