import java.util.Scanner;

public class lah {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        System.out.println("Input Number of Shape: ");
        int Shape= scan.nextInt();
        switch(Shape){
            case 3:
            System.out.print("Triangle ");
            break;
        case 4:
            System.out.print("Square/Rectangle ");
            break;
        case 5:
            System.out.print("Pentagon ");
            break;
        case 6:
            System.out.print("Hexagon ");
            break;
        case 7:
            System.out.print("Heptagon ");
            break;
        case 8:
            System.out.print("Octagon ");
            break;
        case 9:
            System.out.print("Nonagon ");
            break;
        case 10:
            System.out.print("Decagon");
            break;
        case 11:
            System.out.print("Hendecagon ");
            break;
        case 12:
            System.out.print("Dodecagon");
            break;
        default:
            System.out.print("Invalid ");
            break;
        
    }
    }
}
