package Alpro1.Loop.DoWhile;

public class DoWhile {
  public static void main(String[] args) {
    int count = 1;

    do {
      System.out.println("Count: " + count);
      count++;
    } while (count <= 5);

    /*
    output: 
    Count: 1
    Count: 2
    Count: 3
    Count: 4
    Count: 5
     */

  }
}
