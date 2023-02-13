import java.util.Scanner;

public class MP7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    System.out.println(isEven(num));
  }

  public static boolean isEven(int num) {
    if (num % 2 == 0){
        return true;
    }else {
        return false;
    }
  }
}
