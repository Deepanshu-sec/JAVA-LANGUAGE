import java.util.Scanner;
public class condition {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter how much cash do you have : ");
int cash = sc.nextInt();
if(cash < 10){
    System.out.println("You can buy only a chocolate :");
    System.out.println(" nothing else :");
}
else if(cash >= 10 && cash <= 50)
    System.out.println("You can buy a pen :");
else 
    System.out.println("You can buy a book :");
sc.close();
}
} 
      // CONDITIONAL OPERATORS.  (>, <, >=, <=,==, !=)

    // int age = 17;
    // if(age>=18)
    //     System.out.println("Eligible for voting ");
    // else 
    //     System.out.println("Bhaag saale ");    
    
    // LOGICAL OPERATORS . //   (&&, ||, !)
    
//     int a = 143,b = 143;
 
//     if(a==142 || b==143)
//         System.out.println("i love her :");
// else 
//     System.out.println("vo love karti h :");
