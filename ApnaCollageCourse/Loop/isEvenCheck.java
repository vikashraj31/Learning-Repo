public class isEvenCheck {

    static public boolean isEven(int x) {

        if (x % 2 == 0){
            System.out.println("Even number");
            return true;
        }
        else{
            System.out.println("Odd number");
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 77;

        isEven(x);   
    }
}
