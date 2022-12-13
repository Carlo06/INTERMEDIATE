public class pyramid { 
    public static void main(String[] args) {
    
        for (int row = 1; row <= 5; row++) {
                
            for (int j =1  ; j <= 5-row; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= row*2-1 ; k++) {
                
                if (row >= 1 && row <= 2){
                    System.out.print("");
                }else{
                    System.out.print("*");
                }                
                
                    
                
            }
            
            System.out.println();
        }
}
    
}
