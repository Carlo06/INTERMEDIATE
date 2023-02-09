import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
      

       PrintGrade(getGrade());


      
    }

    public static double getGrade(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Quiz 1: ");
        double q1 = sc.nextDouble();
        System.out.print("Enter Quiz 2: ");
        double q2 = sc.nextDouble();
        System.out.print("Enter quiz 3: ");
        double q3 = sc.nextDouble();
        double grade = (q1 + q2 + q3 / 3);

        return(grade);
    }
    // return to void
    // A return statement to void is not needed
    // return statement can be used to terminate the void
    public static void PrintGrade(double average){
        System.out.println("your Grade is: ");
        if (average < 0 || average > 100){
            System.out.println("Invalid grade");
            return;
        }
        if (average >=90){
            System.out.println('A');
        }else if ( average >= 80){
            System.out.println('B');
        }else if (average >= 70){
            System.out.println('C');
        }else if ( average >= 60){
            System.out.println('D');
        }else{
            System.out.println('F');
        }
    }
}
