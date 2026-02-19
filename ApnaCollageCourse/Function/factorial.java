package Function;
import java.util.*;

public class factorial {
    

    static public int fac(int n){
        int f=1;

        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no for factorial");
        int x = sc.nextInt();
        int ans =fac(x);
        System.out.println("Factroial is " + ans);
        
    }

    
}
