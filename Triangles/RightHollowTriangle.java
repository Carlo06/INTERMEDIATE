import java.util.Scanner;
public class RightHollowTriangle{
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        for (int rows = 1; rows <= number ; rows++) {
            System.out.print("\n");
            for (int column = rows; column <= number; column++) {
                  System.out.print("    ");
                     
                }
                    
                for (int column = 1; column < rows; column++) {
                    if ( rows == number || column == 1 || column == rows -1 ){
						System.out.print("  * ");
					}else{
						System.out.print("    ");
					}
                }
                

            }
        }
    }

