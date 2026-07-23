package JavaExamQuestion;
//Write a program with classes Fruit, Banana and Cherry with show() method in each class.
class FruitGroup{
    void show(){
        System.out.println("Fruit Group");
    }
}

class Banana extends FruitGroup{

    void show(){
        System.out.println("This is Banana");
    }
}

class Cherry extends FruitGroup {
    void show(){
        System.out.println("This Cherry");
    }
}
public class Fruit {
    public static void main(String [] agrs){
        FruitGroup F = new FruitGroup();
        F.show();

        Banana B = new Banana();
        B.show();

        Cherry C =new Cherry();
        C.show();
    }
    
}
