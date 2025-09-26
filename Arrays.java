public class Arrays {
    public static void main(String[] args) {
        int[] array1D = {1, 2, 3, 4, 5};
        for (int num : array1D) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int[] row : array2D) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        System.out.println("sum 1D array: " + sum1D(array1D));
        System.out.println("sum 2D array: " + sum2D(array2D));
    }
    
    static int sum1D(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }
    
    static int sum2D(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) sum += num;
        }
        return sum;
    }
}
