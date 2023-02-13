import java.util.Scanner;

public class MP8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Figure: ");
        System.out.println("Press <L> for left triangle");
        System.out.println("Press <R> for Right triangle");
        System.out.println("Press <C> for Right triangle");
        char figure = sc.next().charAt(0);
        System.out.println("Enter the size of the triangle: ");
        int size = sc.nextInt();

        switch (figure){
            case 'L':
            leftTriangle(size);
            break;

            case 'R':
            rightTriangle(size);
            break;

            case 'C':
            centerTriangle(size);
            break;

            default:
            System.out.println("Invalid Input");
        }
        
       
    }

    public static void leftTriangle(int size){

        for (int i = 1; i <= size ; i++) {
            System.out.print("\n");
            for (int j = 1; j <= i; j++) {
                    System.out.print(" * "); 

                     
                }
                System.out.print("\n"); 
            }
           
    }


    public static void rightTriangle(int size){

        for (int rows = 1; rows <= size ; rows++) {
            System.out.print("\n");
            for (int column = rows; column <= size; column++) {
                  System.out.print("  ");
                     
                }
                    
                for (int column = 1; column < rows; column++) {
                    System.out.print(" *");
                }
                
                System.out.print("\n");
            }
       

    }

    public static void centerTriangle(int size){

        for (int row = 1; row <= size; row++) {
                
            for (int column =1  ; column <= size-row; column++) {
                System.out.print(" ");
            }

            for (int column = 1; column <= row*2-1 ; column++) {
                
                System.out.print("*");
            }
            
            System.out.print("\n");
        }

    }

}
