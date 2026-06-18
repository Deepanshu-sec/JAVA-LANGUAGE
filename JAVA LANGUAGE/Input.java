package JAVALANGUAGE;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // how to take string input.
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name : ");
     String name = sc.next();
     System.out.println(name);
     sc.close();
    }
}   