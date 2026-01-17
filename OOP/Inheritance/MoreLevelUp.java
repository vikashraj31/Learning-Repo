package OOP.Inheritance;

class Father {
    int age;

    Father(int a) {
        age = a;
        System.out.println("Father constructor called");
    }
}

class Son extends Father {
    Son(int a) {
        super(a);   // calling parent constructor
        System.out.println("Son constructor called");
    }
}

public class MoreLevelUp {
    public static void main(String[] args) {
        Son s = new Son(45);
        System.out.println("Age: " + s.age);
    }
}
