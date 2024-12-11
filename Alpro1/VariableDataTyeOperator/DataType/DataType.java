package Alpro1.VariableDataTyeOperator.DataType;

public class DataType {
  public static void main(String[] args) {

      // Primitive Data Types
      byte aByte = 10;              // 8-bit integer, range: -128 to 127
      short aShort = 1000;          // 16-bit integer, range: -32,768 to 32,767
      int anInt = 100000;           // 32-bit integer, commonly used for whole numbers
      long aLong = 1000000000L;     // 64-bit integer, must end with 'L'
      float aFloat = 3.14f;         // 32-bit floating-point, must end with 'f'
      double aDouble = 3.14159265359; // 64-bit floating-point, more precise than float
      char aChar = 'A';             // 16-bit Unicode character, stores a single character
      boolean aBoolean = true;      // Boolean value, either true or false

      // Output the values of the data types
      System.out.println("Byte value: " + aByte);
      System.out.println("Short value: " + aShort);
      System.out.println("Integer value: " + anInt);
      System.out.println("Long value: " + aLong);
      System.out.println("Float value: " + aFloat);
      System.out.println("Double value: " + aDouble);
      System.out.println("Character value: " + aChar);
      System.out.println("Boolean value: " + aBoolean);

      // Non-Primitive Data Type (String)
      String aString = "Hello, Java!"; // Sequence of characters
      System.out.println("String value: " + aString);
      
  }
}