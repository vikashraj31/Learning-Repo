import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name 1");

        // String name = sc.next();//Space tk ka hi store krege (Vikash Raj)
        // System.out.println(name);


        String name = sc.nextLine();
        System.out.println(name);// Full Name with Space 


        System.out.println("Enter a  int no , float , double");
        int a = sc.nextInt();
        float b= sc.nextFloat();
        double c = sc.nextDouble();

        System.out.println( a +" "+ " "+ b+ " "  + " " +c);

    }
}