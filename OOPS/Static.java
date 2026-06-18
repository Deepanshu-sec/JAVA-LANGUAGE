class Print{
 static void show(){               // agar static ki jagah public kar de to ise  (Hello dear) ko print karane k liye
System.out.println("Hello Dear ");  // object banane ki jarurat padegi.
 }
}
public class Static {
    public static void main(String[] args){
    // Print p = new Print();             --> is (new print) object ki.
    Print.show();
        }
}
