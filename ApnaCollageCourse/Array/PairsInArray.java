public class PairsInArray {

    static public void Pair(int arra[]) {

        for(int i = 0; i < arra.length; i++) {
            for(int j = i + 1; j < arra.length; j++) {
                System.out.print("(" + arra[i] + "," + arra[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,44,33,66};
        Pair(arr);
    }
}