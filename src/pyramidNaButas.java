import java.util.Scanner;
public class pyramid{
   
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        for (int rows = 0; rows <= number ; rows++) {
            System.out.print("\n");
            for (int column = 0; column <= number; column++) {
                
                if (rows == number);{
                    System.out.print(" * "); 

                     if (rows== 2 && column == 2 || rows == 3 && column == 3 || rows == 1 && column == 4 ){
                        System.out.print(" ");
                    }else{
                        System.out.print(" * ");
                    }
                }
                

            }
        }
    }
}
