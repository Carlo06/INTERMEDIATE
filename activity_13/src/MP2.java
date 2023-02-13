import java.util.Scanner;

public class MP2 {
  public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Enter the integers: ");
        for (int i = 0; i < 3 ; i++){
            numbers[i] = sc.nextInt();
        }

        int sum = total(numbers);
        System.out.println("The sum of the numbers is: " + sum);

    }

    public static int total(int[] numbers) {
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    

 
}
