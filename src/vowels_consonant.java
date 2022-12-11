import java.util.Scanner;
public class vowels_consonant {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vowel or Consonant");
        System.out.print("Enter a letter: ");
        char ch = scan.next().charAt(0);
   
        switch (ch) {
            case 'a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O':
                System.out.println("The letter is Vowel");
                break;
            default:
                System.out.println("The letter is Consonant");
                break;
        }
    }
}
