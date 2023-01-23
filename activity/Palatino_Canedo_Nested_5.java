import java.util.Scanner;
public class Palatino_Canedo_Nested_5{
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        for (int rows = number; rows > 0 ; rows--) {
            System.out.print("\n");
            for (int column = 1; column <= rows; column++) {

                if ( rows == number  || column == 1   || column == rows   ){
                    System.out.print("   * ");
                }else{
                    System.out.print("     ");
                }

                     
                }
                    
                
                

            }
        }
    }
