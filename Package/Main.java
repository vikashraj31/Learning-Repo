package Package;

class Student {
    private int age;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(22);
        System.out.println("Age: " + s.getAge());
    }
}
