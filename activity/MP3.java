import java.util.Scanner;
public class MP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            for(int i = 0  ; i < n; i++){
                System.out.print("Enter size of storage[" + i + "]: ");
                arr[i] = sc.nextInt();
            }
        
            System.out.println("Index\t==>\tElement");
            for(int i = 0 ; i < n; i++){
                System.out.println(i + "\t==>\t" + arr[i]);

                
            }
            System.out.println("Index\t==>\tElement Reverse");

            for (int i = n -1; i >= 0; i--) {
                System.out.println(i + "\t==>\t" + arr[i]);
            }
    }
}
