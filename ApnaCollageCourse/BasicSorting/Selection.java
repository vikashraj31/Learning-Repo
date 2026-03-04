public class Selection {

    public static void Swap(int array[]) {

        for(int i = 0; i < array.length-1; i++) {

            int min = i;

            for(int j = i+1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            // swap
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int Array[] = {2,4,1,7,8,9};
        Swap(Array);
    }
}