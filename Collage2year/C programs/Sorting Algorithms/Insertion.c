#include<stdio.h>

#define Max 10

int arr[Max];

void insertionSort(int arr[], int size) {
    int i, j, temp;
    for(i = 1; i < size; i++) {
        temp = arr[i];
        j = i - 1;
        
        while(j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
}


void printArray(int arr[], int size) {
    for(int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}


int main() {
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int size = sizeof(arr)/sizeof(arr[0]);
    
    printf("Original array: ");
    printArray(arr, size);
    
    insertionSort(arr, size);
    
    printf("Sorted array: ");
    printArray(arr, size);
    
    return 0;
}
