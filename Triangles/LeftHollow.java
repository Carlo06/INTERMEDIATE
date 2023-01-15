import java.util.Scanner;
public class LeftHollow{
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        for (int rows = 1; rows <= number ; rows++) {
            System.out.print("\n");
            for (int column = 1; column <= number; column++) {
                if ( rows == 1 || column == number || column == rows){
                    System.out.print("  * ");
                }else{
                    System.out.print("    ");
                }
                     
                }
                    
                
                

            }
        }
    }

