import java.util.Scanner;
public class MP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0  ; i < size; i++){
                System.out.print("Enter size of storage[" + i + "]: ");
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += arr[i];
                System.out.println(i + "\t==>\t" + arr[i]);
            }
            double avg = sum /(double)size;

            System.out.println("Elements");

            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println(" \nTotal" + sum);
            System.out.println("Average" + avg);
    }
}
