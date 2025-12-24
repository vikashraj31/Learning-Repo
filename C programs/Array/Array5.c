#include <stdio.h>

int main() {
    int arr[] = {7, 2, 9, 4, 9, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    if (n < 2) {
        printf("Array must have at least two elements.\n");
        return 0;
    }

    int first = arr[0], second = -1e9;  // assume very small second

    for (int i = 1; i < n; i++) {
        if (arr[i] > first) {
            second = first;
            first = arr[i];
        }
        else if (arr[i] > second && arr[i] < first) {
            second = arr[i];
        }
    }

    if (second == -1e9) {
        printf("No second largest element (all elements are equal).\n");
    } else {
        printf("Second largest element: %d\n", second);
    }

    return 0;
}
