public class Methods {
    public static void main(String[] args) {
        System.out.println(add(5, 3));
        System.out.println(multiply(4, 2));
        System.out.println(factorial(5));
        greet("Amrul");
        System.out.println(isPrime(17));
    }
    
    static int add(int a, int b) {
        return a + b;
    }
    
    static int multiply(int a, int b) {
        return a * b;
    }
    
    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
