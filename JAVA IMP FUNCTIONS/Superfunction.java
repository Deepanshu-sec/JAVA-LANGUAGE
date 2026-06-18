//super keyword k use se ham parent class k method/class ko call kr sakte h. 
class animal{
    public void eat(){
        System.out.println("Eating");
    }
}
class dog extends animal{
public void eat(){
    System.out.println("Bread Eating ");
}
public void bark(){
    System.out.println("Barking ");
    super.eat();
}
}
public class Superfunction {
    public static void main(String[] args){
dog d = new dog();
d.eat();
d.bark();
    }
}
