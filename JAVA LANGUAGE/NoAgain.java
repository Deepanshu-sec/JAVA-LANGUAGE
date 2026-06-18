// WAP to print the number entered by the user until the user enters a negative number. 
// After that print "THE END".

import java.util.Scanner;

public class NoAgain {
    public static void main(String[] args){
        int number = 0;
                   Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number : ");
    number = sc.nextInt();
            System.out.println("Here is your number : ");
 System.out.println(number);
        }
        while(number>=0);
        System.out.println("THE END");
     sc.close();
    }
}
