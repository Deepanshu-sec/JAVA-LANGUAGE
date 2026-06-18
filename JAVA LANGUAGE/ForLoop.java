package JAVALANGUAGE;
import java.util.Scanner;
public class ForLoop {
    public static void main(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number : ");
int n = sc.nextInt();
for(int i=1;i<=10;i++){
    System.out.print(i*n + "\t");
}
sc.close();
    }
}
