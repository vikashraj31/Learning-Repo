package OOPS.Encapsulation;

class Age {
    private int age; 

   
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Sorry, wrong age. Age must be between 1 and 100.");
        }
    }

   
    public int getAge() {
        return age;
    }

  
    void show() {
        System.out.println("Age: " + this.age);
    }
}

public class StudentAgeInfo {
    public static void main(String[] args) {

        Age c1 = new Age();
        Age c2 = new Age();

        c1.setAge(20);     
        c2.setAge(111);    

        c1.show();
        c2.show();
    }
}
