package Alpro1.Introduction.Print;

public class Print {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!"); // this method will create a new line

        System.out.print("Hello world! ");
        System.out.print("Hello world!"); // this method does not create a new line

        System.out.println("Name: Galuh."); 
        System.out.println("Message: Don't forget to breathe :)");

        /*output: 
        Hello world!
        Hello world!
        Hello world! Hello world!
        Name: Galuh 
        Message: Don't forget to breathe :)
        */ 
    }
}