package OOPS.Inheritance;

class Animal{
     
    void Show(){
        System.out.println("This Class of Ainmal");
    }
}

class Dog extends Animal{

    void Show(){
        System.out.println("This is extend class");
    }
}

public class AnimalInfo {

    public static void main(String[] args) {
        Dog D1= new Dog();
        Animal A1= new Animal();

        D1.Show();
        A1.Show();
    }
    
}