public class CheckDistict {

    public static boolean Check(int Array[]) {

       for(int i=0;i<Array.length; i++){
        for(int j = i+1;j<Array.length; j++){
            if(Array[i]==Array[j])
                return true;
        }
       }
       return false;
    }

    public static void main(String[] args) {
        int Array[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean x = Check(Array);
        System.out.println(x);
    }
}