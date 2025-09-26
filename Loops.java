public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        int j = 0;
        while (j < 5) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
        
        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k < 5);
        System.out.println();
        
        for (int i = 1; i <= 3; i++) {
            for (int m = 1; m <= 3; m++) {
                System.out.print(i * m + " ");
            }
            System.out.println();
        }
    }
}
