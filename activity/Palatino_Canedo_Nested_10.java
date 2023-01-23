import java.util.Scanner;

public class Palatino_Canedo_Nested_10 { 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = sc.nextInt();
    
        for (int row = 1; row <= number; row++) {
                
            for (int column =1  ; column <= number-row; column++) {
                System.out.print(" ");
            }

            for (int column = 1; column <= row*2-1 ; column++) {
                
                System.out.print("*");
            }
            
            System.out.println();
        }
}
    
}