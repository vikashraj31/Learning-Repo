package Array;

public class FindLargest {
    public static void Largest(int arr[]){
        int let = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > let){
                let = arr[i];
            }
        }

        System.out.println(let);
    }

    public static void main(String[] args) {
        int arr[] = {1,4,2,88,6,66};
        Largest(arr);
    }
}
