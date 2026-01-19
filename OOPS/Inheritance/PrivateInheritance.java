package OOPS.Inheritance;

// Parent class
class Father {
    private int age;   // private variable
    String name;

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    // Getter
    public int getAge() {
        return age;
    }
}

// Child class
class Son extends Father {
    int no;

    // Constructor
    Son(int no, String name, int age) {
        this.no = no;
        this.name = name;     // inherited variable
        setAge(age);         // accessing private variable using setter
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
    }
}
