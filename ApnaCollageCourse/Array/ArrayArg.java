package Array;
// Array as argument


public class ArrayArg {

    public static void Update(int array[]){
        for(int i =0; i<array.length; i++){
           array[i] =  array[i]+3;
        }
    }

    public static void main(String [] args){
        int array[]={2,44,39};
        Update(array);

         for(int i =0; i<array.length; i++){
           System.out.println(array[i]);
        }

    }
    
}
