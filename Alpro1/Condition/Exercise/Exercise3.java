package Alpro1.Condition.Exercise;
import java.util.Scanner;
public class Exercise3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String name;
    double academicTest, skillTest,  psychologicalTest, averageScore;

      try {
        System.out.print("Name: ");
        name = scanner.nextLine();

        System.out.print("Academic Test Score: ");
        academicTest = scanner.nextDouble();

        System.out.print("Skill Test Score: ");
        skillTest = scanner.nextDouble();

        System.out.print("Psychological Test Score: ");
        psychologicalTest = scanner.nextDouble();

        scanner.nextLine();

        averageScore = (academicTest + skillTest +  psychologicalTest) / 3;

        if (averageScore < 75) {
          System.out.println("You Failed!.\n");
        } else {
          System.out.println("You Passed!.\n");
            if (academicTest > skillTest && academicTest > psychologicalTest) {
              System.out.println("You Placed in Administrasion!.");
            } else if (skillTest > academicTest && skillTest >  psychologicalTest) {
              System.out.println("You Placed in Production!.");
            } else {
              System.out.println("You Placed in Marketing!.");
            }

          System.out.println("Name: " + name);
          System.out.println("Academic Test Score: " + academicTest);
          System.out.println("Skill Test Score: " + skillTest);
          System.out.println("Psychological Test Score: " + psychologicalTest);
          System.out.println("Average Score: " + averageScore);

        }

      } catch (Exception e) {
        System.out.println("Harap masukkan pilihan yang valid!.");
      }
    scanner.close();
  }
}
