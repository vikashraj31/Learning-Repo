#include<stdio.h>

#define Max 10

void selection(int arr[], int n) {
    int i, j;
    for(i = 0; i < n - 1; i++) {
        int min = i;
        for(j = i + 1; j < n; j++) {
            if(arr[j] < arr[min]) {
                min = j;
            }
        }
        if(min != i) {
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}

void printArray(int arr[], int n) {
    for(int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[] = {64, 25, 12, 22, 11};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    printf("Original array: ");
    printArray(arr, n);
    
    selection(arr, n);
    
    printf("Sorted array: ");
    printArray(arr, n);
    
    return 0;
}
