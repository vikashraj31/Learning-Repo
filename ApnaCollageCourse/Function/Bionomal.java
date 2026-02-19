package Function;

import java.util.*;

public class Bionomal {

    static public int factorial(int a){
        int f = 1;
        for(int i = 1; i <= a; i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n and r:");
        int n = sc.nextInt();
        int r = sc.nextInt();

        if(r > n){
            System.out.println("Invalid input");
            return;
        }

        int N = factorial(n);
        int R = factorial(r);
        int diff = factorial(n - r);

        int ans = N / (R * diff);

        System.out.println("Final ans is " + ans);
    }
}
