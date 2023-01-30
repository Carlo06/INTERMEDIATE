import java.util.Scanner;

public class PALATINO_2DArray_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        
        int[][] storage = new int[rows][columns];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at row " + (i + 1) + " and column " + (j + 1) + ": ");
                storage[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nThe elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(storage[i][j] + " ");
            System.out.println();
        }
    }
}
}
