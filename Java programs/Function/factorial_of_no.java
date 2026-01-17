package Function;

public class factorial_of_no {

    public static int Fact(int a) {
        if(a<0){
            System.out.println("Invalid No");
            return;
        }
        int ans = 1;

        for (int i = 1; i <= a; i++) {
            ans = ans * i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int a = 5;

        int result = Fact(a);// function name not varible name (Mult(a,b))

        System.out.println("Value is: " + result);

    }

}
