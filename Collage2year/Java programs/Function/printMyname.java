package Function;

import java.util.*;

class printMyname {

    //function create 
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }
    // function end here


    // int main type code --
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner sc =new Scanner(System.in);
        String name = sc.next();

        //function call
        PrintMyName(name);
    }
}
