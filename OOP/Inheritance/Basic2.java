package OOP.Inheritance;
  
    class Father {
    int age = 50;
}

class Son extends Father {
    void showAge() {
        System.out.println("Father age: " + age);
    }
}

public class Basic2 {
    public static void main(String[] args) {
        Son s = new Son();
        s.showAge();
    }
}

