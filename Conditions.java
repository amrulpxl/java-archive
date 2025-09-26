public class Conditions {
    public static void main(String[] args) {
        int value = 75;
        
        if (value > 90) {
            System.out.println("A");
        } else if (value > 80) {
            System.out.println("B");
        } else if (value > 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        
        switch (value / 10) {
            case 10, 9 -> System.out.println("excellent");
            case 8 -> System.out.println("good");
            case 7 -> System.out.println("average");
            default -> System.out.println("need improvement");
        }
    }
}
