package Alpro1.Condition.IfElse;

public class IfElse {
  public static void main(String[] args) {
      int score = 85;

      // If Statement
      if (score >= 75) {
          System.out.println("Congratulations! You passed.");
      }

      // If-Else Statement
      if (score >= 90) {
          System.out.println("Your score is excellent!");
      } else {
          System.out.println("Your score is good, but not perfect.");
      }

      // If-Else-If Statement
      if (score >= 90) {
          System.out.println("Grade: A");
      } else if (score >= 75) {
          System.out.println("Grade: B");
      } else if (score >= 60) {
          System.out.println("Grade: C");
      } else {
          System.out.println("Grade: D");
      }

      /*
      output: 
      Congratulations! You passed.
      Your score is good, but not perfect.
      Grade: B
       */
      
  }
}