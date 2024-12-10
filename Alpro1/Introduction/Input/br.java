package Alpro1.Introduction.Input;
import java.io.*; // import java libary

public class br {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String name; // create variable name.
    int age; // create age name.

    try {
      System.out.print("Name: "); // ex: Name: Galuh, you can input your name here!.
      name = br.readLine(); // will read input name.

      System.out.print("Age: "); // ex: Age: 69
      age = Integer.parseInt(br.readLine()); // will read age.

      System.out.println("My name is: " + name); 
      System.out.println("Age: " + age);
      
      /*
        example output: 
        My name is Galuh
        Age: 69
       */ 

    } catch (IOException e) { // if input not valid, sistem will print: Invalid input!.
      System.out.println("Invalid input!.");
    }
  }
}
