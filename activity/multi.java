public class multi {
    public static void main(String[] args) throws Exception {

        // Print the words in their given pattern.

        char[][] array = {
                { 'R', 'E', 'I', 'M', 'A', 'E', 'R', 'S', 'G', 'T' },
                { 'E', 'V', 'D', 'B', 'D', 'V', 'I', 'A', 'B', 'I' },
                { 'E', 'L', 'R', 'O', 'F', 'S', 'A', 'W', 'U', 'K' },
                { 'B', 'G', 'C', 'E', 'I', 'L', 'C', 'J', 'H', 'T' },
                { 'S', 'S', 'K', 'G', 'D', 'Z', 'H', 'S', 'T', 'O' },
                { 'V', 'M', 'J', 'A', 'V', 'H', 'Z', 'S', 'I', 'K' },
                { 'C', 'H', 'I', 'L', 'L', 'T', 'O', 'P', 'G', 'M' },
                { 'Y', 'S', 'P', 'I', 'T', 'A', 'P', 'R', 'W', 'D' },
                { 'G', 'B', 'D', 'S', 'T', 'K', 'P', 'W', 'S', 'O' },
                { 'G', 'T', 'L', 'H', 'Q', 'X', 'Q', 'L', 'O', 'E' },
        };

        // =============================================================
        // ALAK - (10 points)
      //  System.out.println(" ");
        System.out.println("1. ALAK ");

        for (int row = 0; row < array.length; row++) {
            System.out.println(" ");

            for (int column = 0; column < 10; column++) {
                if (row == 7 && (column == 5 )){
                    System.out.println(array[row][column] );
                
                } else if ( row == 6 && (column == 4)){
                  System.out.println(array[row][column] );
                }else if (row == 5 && (column == 3)){
                  System.out.println(array[row][column] );
                } else if (row  == 4 && (column == 2)){
                  System.out.println(array[row][column] );
                }else{
                  System.out.print(" ");
                }
              
            }
            
        }

        // =============================================================
       //  GITHUB - (10 points)
      //  System.out.println(" ");
        System.out.println("2. GITHUB ");
         for (int row = 0; row < array.length; row++) {
           System.out.println(" ");

           for (int column = 0; column < array.length; column++) {

            if ( row == 6 && (column == 8)){
              System.out.println(array[row][column]);
            }else if (row == 5 && (column == 8)){
              System.out.println(array[row][column]);
            }else if (row == 4 && (column == 8)){
              System.out.println(array[row][column]);
            }else if (row == 3 && (column == 8)){
              System.out.println(array[row][column]);
            }else if (row == 2 && (column == 8)){
              System.out.println(array[row][column]);
            }else if (row == 1 && (column == 8)){
              System.out.println(array[row][column]);
            }
           }
         }


        // =============================================================
        // SISIG - (10 points)
    //    System.out.println(" ");
        System.out.println("3. SISIG ");
           for (int row = 0; row < array.length; row++) {
           System.out.println(" ");

           for (int column = 0; column < array.length; column++) {

            if ( row == 0 && (column == 7)){
              System.out.println(array[row][column]);
            }else if ( row == 1 && (column == 6)){
              System.out.println(array[row][column]);
            }else if ( row == 2 && (column == 5)){
              System.out.println(array[row][column]);
            }else if ( row == 3 && (column == 4)){
              System.out.println(array[row][column]);
            }else if ( row == 4 && (column == 3)){
              System.out.println(array[row][column]);
            } else{
            System.out.print(" ");
            }
          }
        }
        // =============================================================
        // VSCODE - (10 points)
     //   System.out.println(" ");
        System.out.println("4. VSCODE ");

        for (int row = 0; row < array.length; row++) {
          System.out.println(" ");

          for (int column = 0; column < array.length; column++) {

           if ( row == 5 && (column== 0)){
             System.out.println(array[row][column]);
           }else if (row == 4 && (column == 1)){
             System.out.println(array[row][column]);
           }else if (row == 3 && (column == 2)){
             System.out.println(array[row][column]);
           }else if (row == 2 && (column == 3)){
             System.out.println(array[row][column]);
           }else if (row == 1 && (column == 4)){
             System.out.println(array[row][column]);
           }else if (row == 0 && (column == 5)){
             System.out.println(array[row][column]);
           }else{
            System.out.print(" ");
           }
          }
        }

        // =============================================================
        // BEER - (10 points)
      //  System.out.println(" ");
       System.out.println("5. BEER ");
       for (int row = 0; row < array.length; row++) {
        System.out.println(" ");

        for (int column = 0; column < array.length; column++) {

         if ( row == 0 && (column == 0)){
           System.out.println(array[row][column]);
         }else if (row == 1 && (column == 0)){
           System.out.println(array[row][column]);
         }else if (row == 2 && (column == 0)){
           System.out.println(array[row][column]);
         }else if (row == 3 && (column == 0)){
           System.out.println(array[row][column]);
         }
        }
      }
        // =============================================================
        // JAVA - (10 points)
      //  System.out.println(" ");
       System.out.println("6. JAVA ");
       for (int row = 0; row < array.length; row++) {
        System.out.println(" ");

        for (int column = 0; column < array.length; column++) {

         if ( row == 3 && (column == 7)){
           System.out.println(array[row][column]);
         }else if (row == 2 && (column == 6)){
           System.out.println(array[row][column]);
         }else if (row == 1 && (column == 5)){
           System.out.println(array[row][column]);
         }else if (row == 0 && (column == 4)){
           System.out.println(array[row][column]);
         }else{
          System.out.print(" ");
         }
        }
      }
        // =============================================================
        // TIKTOK - (10 points)
       // System.out.println(" ");
        System.out.println("7. TIKTOK ");
        for (int row = 0; row < array.length; row++) {
          System.out.println(" ");
  
          for (int column = 0; column < array.length; column++) {
  
           if ( row == 0 && (column == 9)){
             System.out.println(array[row][column]);
           }else if (row == 1 && (column == 9)){
             System.out.println(array[row][column]);
           }else if (row == 2 && (column == 9)){
             System.out.println(array[row][column]);
           }else if (row == 3 && (column == 9)){
             System.out.println(array[row][column]);
           }else if (row == 4 && (column == 9)){
            System.out.println(array[row][column]);
          }else if (row == 5 && (column == 9)){
            System.out.println(array[row][column]);
        }
      }
    }
        // =============================================================
        // CHILLTOP - (10 points)
      //  System.out.println(" ");
        System.out.println("8. CHILLTOP ");
        for (int row = 0; row < array.length; row++) {
          for (int column = 0; column < array.length; column++) {
            if (row == 6){
              if (column == 9 || column == 8){

              }else {
                System.out.print(array[row][column]);
              }
            }
          
          }
        }
        
      
    
         
        // =============================================================
        // REDHORSE - (10 points)
      //  System.out.println(" ")
        for (int row = 0; row < array.length; row++) {
          System.out.println(" ");
  
          for (int column = 0; column < array.length; column++) {
  
           if ( row == 2 && (column == 2)){
             System.out.println(array[row][column]);
           }else if (row == 3 && (column == 3)){
             System.out.println(array[row][column]);
           }else if (row == 4 && (column == 4)){
             System.out.println(array[row][column]);
           }else if (row == 5 && (column == 5)){
             System.out.println(array[row][column]);
           }else if (row == 6 && (column == 6)){
            System.out.println(array[row][column]);
          }else if (row == 7 && (column == 7)){
            System.out.println(array[row][column]);
        }else if (row == 8 && (column == 8)){
          System.out.println(array[row][column]);
      }else if (row == 9 && (column == 9)){
        System.out.println(array[row][column]);
      }else{
        System.out.print(" ");
      }
    }
  }
        // =============================================================
        // TIPSY - (10 points)
       // System.out.println(" ");
        System.out.println("10. TIPSY ");
        for (int row = 0; row < array.length; row++) {
          for (int column = 0; column < array.length; column++) {
            if (row == 7 && (column == 4)){
              System.out.print(array[row][column]);
            } else if (row == 7 && (column == 3)){
              System.out.print(array[row][column]);
            }else if (row == 7 && (column == 2)){
              System.out.print(array[row][column]);
            }else if (row == 7 && (column == 1)){
              System.out.print(array[row][column]);
            }else if (row == 7 && (column == 0)){
              System.out.print(array[row][column]);
            }
          
        }
    }
}
}

    
   