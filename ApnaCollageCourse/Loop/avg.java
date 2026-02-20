public class avg {

    static public double avrage(int a,int b,int c){
        double ans = (a + b + c)/3.0;
        return ans;
    }

    public static void main(String[] args) {
        int a =5; int b=0; int c=100;
        double x =avrage(a, b, c);
        System.out.println(x);
    }
    
}
