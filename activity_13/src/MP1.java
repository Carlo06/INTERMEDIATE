import java.util.Scanner;

public class MP1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Number");
    int number = sc.nextInt();


    if(evenArray(number)){
        System.out.println("The number " +  number + " is even");

    }else{
        System.out.println("The number " + number + " is odd");
    }

   
  }

  public static boolean evenArray(int number) {
 
      if (number % 2 == 0) {
            return true;
      }else{
            return false;
      }
      
    

  }
}
