import java.util.Scanner;
public class MP1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter element for index[1]: ");
                arr[0] = sc.nextInt();
                System.out.print("Enter element for index[2]: ");
                arr[1] = sc.nextInt();
                System.out.print("Enter element for index[3]: ");
                arr[2] = sc.nextInt();
                System.out.print("Enter element for index[4]: ");
                arr[3] = sc.nextInt();
                System.out.print("Enter element for index[5]: ");
                arr[4] = sc.nextInt();
                
                System.out.println("Index\t==>\tElement");
                System.out.println(0 + "\t==>\t" + arr[0]);
                System.out.println(1 + "\t==>\t" + arr[1]);
                System.out.println(2 + "\t==>\t" + arr[2]);
                System.out.println(3 + "\t==>\t" + arr[3]);
                System.out.println(4 + "\t==>\t" + arr[4]);
            }   
    }

