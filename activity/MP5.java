import java.util.Scanner;
public class MP5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0  ; i < size; i++){
                System.out.print("Enter size of storage[" + i + "]: ");
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            int min = arr[0];

            for(int i = 1 ; i < size; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
                if (arr[i] < min ){
                    min = arr[i];
                }
           
        }
        System.out.println("The Maximum value in the array is: " + max);
        System.out.println("The Minimum value in the array is: " + min );
    }
}
                            
                           
                           
                        
                    
                
                
            
            
            

           
            
           
    

