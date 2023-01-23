import java.util.Scanner;
public class Palatino_Canedo_Nested_3{
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        for (int rows = number; rows >= 1 ; rows--) {
            System.out.print("\n");
            for (int column = 1; column <= rows; column++) {
                    System.out.print(" * "); 

                     
                }
                    
                
                

            }
        }
    }
