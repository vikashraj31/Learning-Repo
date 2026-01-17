package OOP.Polymorphism;

class Man {
    String name;
    int no;
    int age;

    // Method Overloading (Compile Time Polymorphism)

    void printInfo(String name){
        System.out.println("Name: " + name);
    }

    void printInfo(int no){
        System.out.println("Number: " + no);
    }

    void printInfo(String name, int age, int no){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number: " + no);
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Man m1 = new Man();

        m1.printInfo("Vikash");
        // m1.printInfo(101);
        // m1.printInfo("Vikash", 21, 101);
    }
}
