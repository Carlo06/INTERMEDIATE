import java.util.Scanner;

public class MP4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    System.out.println("Number of Vowel: " + countConsonants(str));
  }

  public static int countConsonants(String str) {
    int count = 0;
    str = str.toLowerCase();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch >= 'a' && ch <= 'z' && !isConsonant(ch)) {
        count++;
      }
    }
    return count;
  }

  public static boolean isConsonant(char ch) {
    switch (ch) {
      case 'b':
      case 'c':
      case 'd':
      case 'f':
      case 'g':
      case 'h':
      case 'j':
      case 'k':
      case 'l':
      case 'm':
      case 'n':
      case 'p':
      case 'q':
      case 'r':
      case 't':
      case 'v':
      case 'w':
      case 'x':
      case 'y':
      case 'z':

        return true;
      default:
        return false;
    }
  }
}
