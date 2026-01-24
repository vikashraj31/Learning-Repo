package OOPS.Inheritance;

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
