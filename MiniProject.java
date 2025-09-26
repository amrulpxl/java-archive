import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        double result = 0;
        boolean running = true;
        
        try (Scanner scanner = new Scanner(System.in)) {
            while (running) {
                System.out.println("\ncalculator listing:");
                System.out.println("1. add");
                System.out.println("2. subtract");
                System.out.println("3. multiply");
                System.out.println("4. divide");
                System.out.println("5. show result");
                System.out.println("6. clear result");
                System.out.println("7. exit");
                
                System.out.print("choose operation (1-7): ");
                int choice = scanner.nextInt();
                
                if (choice >= 1 && choice <= 4) {
                    System.out.print("enter number: ");
                    double num = scanner.nextDouble();
                    
                    switch (choice) {
                        case 1 -> result += num;
                        case 2 -> result -= num;
                        case 3 -> result *= num;
                        case 4 -> {
                            if (num != 0) {
                                result /= num;
                            } else {
                                System.out.println("Error: division by zero");
                            }
                        }
                    }
                } else {
                    switch (choice) {
                        case 5 -> System.out.println("current result: " + result);
                        case 6 -> {
                            result = 0;
                            System.out.println("result cleared");
                        }
                        case 7 -> running = false;
                        default -> System.out.println("invalid choice");
                    }
                }
            }
        }
        System.out.println("calculator closed");
    }
}
