class a{
    static String name;
    a(){
        System.out.println("Hello This is a Constructor : ");
    }
    public void show(){
        name = "Pundir";
        System.out.println("Hello Deepanshu " + name);
    }
    }
public class Constructor {
    public static void main(String[] args) {
        a x = new a();
        x.show();
    }
}
