/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String a = "Ruby";
//        String b = "Rose";
//        String c = "Ed";
//        String d = "April";
//        String e = "Ann";
//        
//        int j = 23;
//        int k = 25;
//        int l = 26;
//        int m = 24;
//        int n = 21;
//        
//        String gender1 = "Female";
//        String gender2 = "Female";
//        String gender3 = "Male";
//        String gender4 = "Female";
//        String gender5 = "Female";
//        
//        String z = "Manila";
//        String h = "Muntinlupa";
//        String g = "Makati";
//        String o = "Laguna";
//        String u = "Cavite";
        
//        System.out.println("Name\t\tAge\t\tGender\t\tCity");
//        System.out.println("====================================================");
//        System.out.println(a + "\t\t" + j + "\t\t" + gender1 + "\t\t" + z);
//        System.out.println(b + "\t\t" + k + "\t\t" + gender2 + "\t\t" + h);
//        System.out.println(c + "\t\t" + l + "\t\t" + gender3 + "\t\t" + g);
//        System.out.println(d + "\t\t" + m + "\t\t" + gender4 + "\t\t" + o);
//        System.out.println(e + "\t\t" + n + "\t\t" + gender5 + "\t\t" + u);


                    //   0         1        2        3       4          = index 
        String name[] = {"Ruby" , "Rose" , "Ed" , "April" , "Ann"};
        int age[] = {23 , 25, 26 , 24, 21};
        String gender[] = {"Female" , "Female" , "Male", "Female" , "Female"};
        String city[] = {"Manila" , "Muntinlupa", "Makati", "Laguna" , "Cavite"};
        
//        System.out.println("Name\t\tAge\t\tGender\t\tCity");
//        System.out.println("====================================================");
//        System.out.println(name[0] + "\t\t" + age[0] + "\t\t" + gender[0] + "\t\t" + city[0]);
//        System.out.println(name[1] + "\t\t" + age[1] + "\t\t" + gender[1] + "\t\t" + city[1]);
//        System.out.println(name[2] + "\t\t" + age[2] + "\t\t" + gender[2] + "\t\t" + city[2]);
//        System.out.println(name[3] + "\t\t" + age[3] + "\t\t" + gender[3] + "\t\t" + city[3]);
//        System.out.println(name[4] + "\t\t" + age[4] + "\t\t" + gender[4] + "\t\t" + city[4]);
        
        
        //Declaration of Array
        //1. With initialized value.
 //       int arr[] = {100 , 70 , 60 , 85 , 90};
        //2. With initialized size.
 //       double[] arr1 = new double[10];
        //3. just declaration.
 //       int[] arr2;
        
        //Call-out   0  1   2   3  4   5    6  7  8
//        int num[] = {8, 9, 20, -5, 6, -1, -23, 0, 11, 23, 56};
//        System.out.println(num[8]);
//        System.out.println(num[0]);
        
        //Assign
//        num[0] = 800;
//        System.out.println(num[0]);
//        
//        int[] number = new int[5];
//        
//        System.out.print("Enter element for index[1]: ");
//        number[1] = sc.nextInt();
//        
//        number[0] = 10;
//        
//        number[2] = 30;
//        
//        number[4] = 50;
//        System.out.println(number[0] + " , " + number[1] + " , " + number[2] + " , " + number[3] + " , " + number[4]);
     


         //Control Structure 
//         int[] arr = new int[5];
//         
//         System.out.print("Enter element for index[0]: ");
//         arr[0] = sc.nextInt();
//         System.out.print("Enter element for index[1]: ");
//         arr[1] = sc.nextInt();
//         System.out.print("Enter element for index[2]: ");
//         arr[2] = sc.nextInt();
//         System.out.print("Enter element for index[3]: ");
//         arr[3] = sc.nextInt();
//         System.out.print("Enter element for index[4]: ");
//         arr[4] = sc.nextInt();
//         
//         System.out.println("Index\t==>\tElement");
//         System.out.println(0 + "\t==>\t" + arr[0]);
//         System.out.println(1 + "\t==>\t" + arr[1]);
//         System.out.println(2 + "\t==>\t" + arr[2]);
//         System.out.println(3 + "\t==>\t" + arr[3]);
//         System.out.println(4 + "\t==>\t" + arr[4]);


            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            for(int i = 0 ; i < n; i++){
                System.out.print("Enter element for index[" + i + "]: ");
                arr[i] = sc.nextInt();
            }
        
            System.out.println("Index\t==>\tElement");
            for(int i = 0 ; i < n; i++){
                System.out.println(i + "\t==>\t" + arr[i]);
            }

    }
    
}