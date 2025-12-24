//Check if the array is sorted in ascending order or not.
//Example: [1, 2, 3, 5] → sorted ✅
#include <stdio.h>

int main() {
    int arr[] = {2, 4, 6, 5, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    int isSorted = 1;  // assume sorted

    for (int i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            isSorted = 0;  // found unsorted place
            break;         // no need to check further
        }
    }

    if (isSorted) {
        printf("Array is sorted in ascending order ✅\n");
    } else {
        printf("Array is NOT sorted ❌\n");
    }

    return 0;
}
