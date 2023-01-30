import java.util.Scanner;

public class PALATINO_2DArray_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of semesters: ");
    int semesters = sc.nextInt();

    double[][] grades = new double[semesters][];
    double[] semesterGrades = new double[semesters];
    double finalGrade = 0;

    for (int i = 0; i < semesters; i++) {
      System.out.print("Enter the number of quizzes in semester " + (i + 1) + ": ");
      int quizzes = sc.nextInt();

      grades[i] = new double[quizzes];

      System.out.println("Enter the grades for semester " + (i + 1) + ":");
      double semesterTotal = 0;
      for (int j = 0; j < quizzes; j++) {
        System.out.print("Quiz " + (j + 1) + ": ");
        grades[i][j] = sc.nextDouble();
        semesterTotal += grades[i][j];
      }

      semesterGrades[i] = semesterTotal / quizzes;
      System.out.println("The average grade for semester " + (i + 1) + " is " + semesterGrades[i]);
      finalGrade += semesterGrades[i];
    }

    finalGrade /= semesters;
    System.out.println("The final grade is " + finalGrade);
  }
}
