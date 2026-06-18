class person {
    int id;
    String name;
    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " " + name);
    }
}

class Emp extends person {
    int Salary;

    public Emp(int id, String name, int Salary) {
        super(id, name);
        this.Salary = Salary;
    }

    public void display() {
        System.out.println(id + " " + name + " " + Salary);
    }
}

public class superFunction2 {
    public static void main(String[] args) {
        Emp e = new Emp(101, "Deepanshu", 10000000);
        e.display();
        person p = new person(102, "John");
        p.display();
    }
}
