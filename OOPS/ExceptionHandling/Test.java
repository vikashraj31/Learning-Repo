package OOPS.ExceptionHandling;

public class Test {
    public static void main(String[] args) {
        try{
            level1();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void level3(){
        int arr[] = {2,4,6};
        arr[3]=10;
    }

    public static void level2(){
        level3();
    }

    public static void level1(){
        level2();
    }
    
}
