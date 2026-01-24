package OOPS.Inheritance;


/*
 * If the parent (super) class does NOT define any constructor,
 * Java automatically provides a default no-argument constructor.
 * 
 * In this case, the child class does NOT need to explicitly call super(),
 * because the default parent constructor is invoked automatically.
 * 
 * However, if the parent class defines a parameterized constructor,
 * the child class must explicitly call it using super(arguments),
 * otherwise a compile-time error occurs.
 */


class Father {
    private int age;  
    String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}


class Son extends Father {
    int no;


    Son(int no, String name, int age) {
        this.no = no;
        this.name = name;    
        setAge(age);      
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + no);
        System.out.println("Age: " + getAge());
    }
}

public class PrivateInheritance {
    public static void main(String[] args) {

        Son s1 = new Son(234, "Vikash", 22);
        s1.show();

        Son s2 = new Son(114, "Aastha", 20);
        s2.show();
    }
}
