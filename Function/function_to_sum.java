package Function;

public class function_to_sum {

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        
        // Store the result in a variable
        int result = sum(a, b);

        //both print the same vale 
        System.out.println("Sum is: " + result);
        System.err.println(result);
        
        
    }
} 