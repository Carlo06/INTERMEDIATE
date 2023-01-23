import java.util.Scanner;
public class MP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            
            int[] arr = new int[size];
            
            for(int i = 0  ; i < size; i++){
                System.out.print("Enter size of storage[" + i + "]: ");
                arr[i] = sc.nextInt();
            }
            int a = arr[size] , b = arr[size] , c = arr[size] , temp;
            for(int i = 1 ; i < size; i++){
                if(arr[i] > a){
                    a = arr [i];
                }
                if (arr[i] < b ){
                    b = arr [i];
                }
                if (arr[i] < c ){
                    c = arr [i];
                }
           
        }
        System.out.println("The Sort value in the array is: " + a + "," + b + "," + c);
       
    }
}
                            
                           
                           
                        
                    
                
                
            
            
            

           
            
           
    

