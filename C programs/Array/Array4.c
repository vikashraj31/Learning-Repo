// Remove duplicates from an array
#include <stdio.h>

int main() {
    int arr[] = {2, 4, 5, 4, 5, 3, 6, 7, 8};
    int n = sizeof(arr)/sizeof(arr[0]);
    int k = 0;  // index for unique elements

    for(int i = 0; i < n; i++) {
        int j;
        for(j = 0; j < i; j++) {
            if(arr[i] == arr[j]) {
                break;  // duplicate found
            }
        }
        if(j == i) {  // no duplicate found
            arr[k++] = arr[i];  // store unique element
        }
    }

    // Print unique elements
    printf("Array without duplicates: ");
    for(int i = 0; i < k; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
