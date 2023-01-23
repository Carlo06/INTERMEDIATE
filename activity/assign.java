public class assign {
    public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
        
        //PATTER 1
          for (int rows = 0; rows < mdArray.length; rows++){
                        System.out.println("");
            for (int column = 0; column < 3 ; column++){
                if (rows %2 != 0 ){
                System.out.print(mdArray[rows][column]);
            }
          }
        }
        
        //PATTERN 2
         for (int rows = 0; rows < mdArray.length; rows++){
                        System.out.println("");
            for (int column = 0; column < 3 ; column++){
                 if (rows %2 == 0 ){
                System.out.print(mdArray[rows][column]);
                 }
            }
         }
      
            // PATTERN 3 
         for (int row = 0; row < mdArray.length; row++){
                    System.out.println("");
                 for (int column = 0; column < 3 ; column++){
                            if (row == 0 || row == 3){

                    System.out.print(mdArray[row][column]);
                             }
                            if (row == 1 || row == 2 ){
                                if (column == 0 || column == 2 ){
                                 System.out.print (" ");
                     }else{
                         System.out.print(mdArray[row][column]);
                     }
                   }
                 }
            }
            
            //PATTERN 4
            for (int row = 0; row < mdArray.length; row++){
                    System.out.println("");
                 for (int column = 0; column < 3 ; column++){
                             if (row == 1 || row == 3){

                    System.out.print(mdArray[row][column]);
                             }
                            if (row == 0 || row == 2 ){
                                if (column == 0 || column == 2 ){
                                 System.out.print (" ");
                     }else{
                         System.out.print(mdArray[row][column]);
                }
              }
            }
            }
            
            System.out.println("");
        
        // PATTERN 5
        int [][] TotalArray = {{1,1,1},{1,1,1},{1,1,1},{1, 1, 1}};
        int sum = 0;
            for (int row = 0; row < TotalArray.length; row++){
                    for   (int column = 0; column < 3 ; column++){
                        sum += TotalArray[row][column];
                     
                }

                 }
                 System.out.println(sum);
                 
                 
            
            
            
         }
}
    
    