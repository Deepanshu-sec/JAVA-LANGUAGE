// ise ham ENCAPSULATION bhi keh sakte h.
package Bank;
class Account {
   public String name;        // --> public h.
   int n;                     // --> default h.
   protected String email;    // --> protected h.
 private String password ;    // --> private h.

 public String getpass(){
   return this.password;
}
public void setpass(String pass){
   this.password = pass;
}
}
public class jump {
   public static void main(String[] args) {
      Account account1 = new Account();
      account1.name = "Dear Deepanshu ";
      account1.email = "abcd@gmail.com ";
      account1.setpass("ajljdhbg") ;
      System.out.println(account1.getpass());
   }
}
