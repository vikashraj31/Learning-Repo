package Function;

public class function_to_mult {
    

    public static int Mult(int a, int b) {
        int M = a * b;
        return M;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        
        // Store the result in a variable
        int result = Mult(a, b);//function name not varible name (Mult(a,b))


        System.out.println("Value is: " + result);
        
        
        
    }
} 

