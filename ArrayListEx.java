import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        
        System.out.println("size: " + fruits.size());
        System.out.println("contains apple? " + fruits.contains("apple"));
        System.out.println("index of banana: " + fruits.indexOf("banana"));
        
        fruits.remove("cherry");
        fruits.add(1, "blueberry");
        
        Collections.sort(fruits);
        System.out.println("\nsorted fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 10; i >= 1; i--) {
            numbers.add(i);
        }
        
        Collections.sort(numbers);
        System.out.println("\nsorted numbers:");
        numbers.forEach(System.out::println);
    }
}
