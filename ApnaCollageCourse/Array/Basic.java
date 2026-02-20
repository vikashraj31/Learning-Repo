package Array;
import java.util.*;

public class Basic {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //Different type of Arrays
        int data[] = new int[20];
        int data2[] = {1,2,3,4};
        char A[]= {'a','b'};
        String S[]={"Vikash", "Aastha"};

        //Input different 

        System.out.println("Enter the data");
        data[0]=sc.nextInt();
        data[1]=sc.nextInt();

        for(int x=2; x<20;x++){
            System.out.print("Enter the no");
            data[x]=sc.nextInt();
        }
    }
    
}
