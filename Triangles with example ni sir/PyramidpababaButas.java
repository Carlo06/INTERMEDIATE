import java.util.Scanner;
public class PyramidpababaButas{
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        for (int rows = 0; rows <= number ; rows++) {
            System.out.print("\n");
            for (int column = 0; column <= rows; column++) {
                if ( rows == 1 || column == 1 || column == rows){
                    System.out.print("  * ");
                }else{
                    System.out.print("     ");
                }

                     
                }
                    
                
                

            }
        }
    }

