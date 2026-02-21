public class Reverse {
    public static void main(String[] args) {

        int array[] = {1, 3, 4, 2, 5, 7, 5};

        int start = 0;
        int end = array.length - 1;

        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        // print reversed array
        for(int num : array)
            System.out.print(num + " ");
    }
}