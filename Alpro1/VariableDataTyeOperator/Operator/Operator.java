package Alpro1.VariableDataTyeOperator.Operator;

public class Operator {
  public static void main(String[] args) {

      // Arithmetic Operators
      int a = 10, b = 5;
      System.out.println("Addition (a + b): " + (a + b));    // Adds a and b
      System.out.println("Subtraction (a - b): " + (a - b)); // Subtracts b from a
      System.out.println("Multiplication (a * b): " + (a * b)); // Multiplies a and b
      System.out.println("Division (a / b): " + (a / b));    // Divides a by b
      System.out.println("Modulus (a % b): " + (a % b));     // Remainder of a divided by b

      // Relational Operators
      System.out.println("Is a equal to b (a == b): " + (a == b)); // Checks if a equals b
      System.out.println("Is a not equal to b (a != b): " + (a != b)); // Checks if a is not equal to b
      System.out.println("Is a greater than b (a > b): " + (a > b));  // Checks if a is greater than b
      System.out.println("Is a less than b (a < b): " + (a < b));    // Checks if a is less than b

      // Logical Operators
      boolean x = true, y = false;
      System.out.println("Logical AND (x && y): " + (x && y)); // True if both x and y are true
      System.out.println("Logical OR (x || y): " + (x || y));  // True if either x or y is true
      System.out.println("Logical NOT (!x): " + (!x));         // Inverts the value of x

      // Bitwise Operators
      int p = 5, q = 3; // Binary of 5 is 0101, Binary of 3 is 0011
      System.out.println("Bitwise AND (p & q): " + (p & q));  // Performs bitwise AND
      System.out.println("Bitwise OR (p | q): " + (p | q));   // Performs bitwise OR
      System.out.println("Bitwise XOR (p ^ q): " + (p ^ q));  // Performs bitwise XOR
      System.out.println("Bitwise Complement (~p): " + (~p)); // Performs bitwise NOT

      // Assignment Operators
      int c = 10, d = 20;
      c += 5; // Equivalent to c = c + 5
      System.out.println("After c += 5: " + c);
      c -= 2; // Equivalent to c = c - 2
      System.out.println("After c -= 2: " + c);
      d *= 5; //  Equivalent to c = c * 5
      System.out.println("After d *= 5: " + d);
      d /= 2; // Equivalent to d = d / 2
      System.out.println("After d /= 2: " + d);

  }
}