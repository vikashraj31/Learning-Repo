#include <stdio.h>
#include <time.h>

int main() {
    int n, i;
    clock_t start, end;
    double time;

    printf("Enter number of elements in array ");
    scanf("%d", &n);

    int a[n];

    printf("Enter elements: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    start = clock();

    
    for (i = 1; i < n; i++) {
        int curr = a[i];
        int pre = i - 1;

        while (pre >= 0 && a[pre] > curr) {
            a[pre + 1] = a[pre];
            pre--;
        }

        a[pre + 1] = curr;
    }

    end = clock();

    time = (end - start) / CLOCKS_PER_SEC;

    printf("Sorted array: ");
    for (i = 0; i < n; i++) {
        printf("%d ", a[i]);
    }

    printf("\nExecution Time = %f seconds\n", time);

    printf("The space complexity is O(1)\n");
    printf("Best case O(n)\n");
    printf("Avg Case O(n^2)\n");
    printf("Worst Case  O(n^2)\n");

    return 0;
}