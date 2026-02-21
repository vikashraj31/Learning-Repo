public class BinarySearch {

    public static int Search(int a[], int no) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == no)
                return mid;

            if (a[mid] < no)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 33, 56, 77, 100 };

        System.out.println(Search(arr, 56));
    }
}