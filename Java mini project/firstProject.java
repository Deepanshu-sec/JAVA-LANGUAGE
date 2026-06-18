        // My first mini project in java.
        import java.util.Scanner;
  
public class firstProject {
    public static void main(String[] args){

Scanner sc = new Scanner(System . in);

int mynumber = (int)(Math.random()*100);
int usernumber = 0;             // agar 0 na bhi lagaye to compiler apne aap maan lega 0 hi. 
do{
System.out.print("Guess a number between (1-100) : ");
usernumber = sc.nextInt();
if(usernumber==mynumber) {
    System.out.println("YAHOO..CORRECT!!!");
break;
}
else if(usernumber>mynumber)
System.out.println("Your number is too large..");
 else
    System.out.println("Your number is small..");
} 
while(usernumber>=0);
System.out.println("My number was : " + mynumber);
sc.close();
}

}
