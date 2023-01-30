import java.util.Scanner;

public class PALATINO_2DArray_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of arrays: ");
    int arrays = sc.nextInt();

    int[][] values = new int[arrays][];
    int minValue = Integer.MAX_VALUE;
    int maxValue = Integer.MIN_VALUE;

    for (int i = 0; i < arrays; i++) {
      System.out.print("Enter the number of values in array: " + (i + 1) + ": ");
      int arraySize = sc.nextInt();

      values[i] = new int[arraySize];

      System.out.println("Enter the values for array: " + (i + 1) + ":");
      int arrayMin = Integer.MAX_VALUE;
      int arrayMax = Integer.MIN_VALUE;
      for (int j = 0; j < arraySize; j++) {
        System.out.print("Value " + (j + 1) + ": ");
        values[i][j] = sc.nextInt();
        if (values[i][j] < arrayMin) {
          arrayMin = values[i][j];
        }
        if (values[i][j] > arrayMax) {
          arrayMax = values[i][j];
        }
      }

      System.out.println("The minimum value for array " + (i + 1) + " is: " + arrayMin);
      System.out.println();
      System.out.println("The maximum value for array " + (i + 1) + " is:" + arrayMax);
      if (arrayMin < minValue) {
        minValue = arrayMin;
      }
      if (arrayMax > maxValue) {
        maxValue = arrayMax;
      }
    }

    System.out.println("The minimum value for all arrays is: " + minValue);
    System.out.println();
    System.out.println("The maximum value for all arrays is: " + maxValue);
    System.out.println();
  }
}
