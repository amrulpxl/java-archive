import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        Optional<String> present = Optional.of("hello");
        Optional<String> nullable = Optional.ofNullable(null);

        System.out.println("is empty present? " + empty.isPresent());
        System.out.println("is present present? " + present.isPresent());
        System.out.println("is nullable present? " + nullable.isPresent());

        try {
            empty.ifPresent(value -> System.out.println("Value: " + value));
        } catch (Exception e) {
            System.out.println("error getting empty value: " + e.getMessage());
        }

        String result = empty.orElse("Default Value");
        System.out.println("empty or else: " + result);


        String result2 = empty.orElseGet(() -> "Computed Value");
        System.out.println("empty or else get: " + result2);

        Optional<String> name = Optional.of("Amrul");
        name.ifPresent(n -> System.out.println("name is present: " + n));

        Optional<String> upper = name.map(String::toUpperCase);
        System.out.println("Uppercase: " + upper.orElse(""));

        Optional<String> filtered = name.filter(n -> n.length() > 3);
        System.out.println("filtered present? " + filtered.isPresent());

        String result3 = Optional.ofNullable(getName())
                               .map(String::trim)
                               .filter(n -> !n.isEmpty())
                               .orElse("unknown");
        System.out.println("final result: " + result3);
    }

    private static String getName() {
        return "  Amrul  ";
    }
}
