import java.util.Scanner;

public class MP3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int n = sc.nextInt();
    double[] numbers = new double[n];

    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      numbers[i] = sc.nextDouble();
    }

    System.out.println("The average of the elements is: " + average(numbers));
    sc.close();
  }

  public static double average(double[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum / arr.length;
  }
}
