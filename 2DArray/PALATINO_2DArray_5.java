import java.util.Scanner;
import java.util.Arrays;

public class PALATINO_2DArray_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the quantity of array: ");
        int arrayQuantity = sc.nextInt();
        System.out.print("Enter the size of each array: ");
        int arraySize = sc.nextInt();

        int[][] array = new int[arrayQuantity][arraySize];

        for (int i = 0; i < arrayQuantity; i++) {
            System.out.println("Enter element for array[" + (i + 1) + "]: ");
            for (int j = 0; j < arraySize; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arrayQuantity; i++) {
            Arrays.sort(array[i]);
            System.out.print("SortedArray " + (i + 1) + ": ");
            for (int j = 0; j < arraySize; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();

            sc.close();
        }
    }
}