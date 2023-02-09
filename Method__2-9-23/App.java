
public class App {

    public static void main(String[] args) {
        Double j = 5.7;
        Double i = 12.8;
        Double k = max(i , j);

        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }


    public static double max (double num1, double num2){
        double results;    
        if(num1>num2){
            results = num1;

        }else{
            results = num2;
        }


        return results;

    }
        
    
}