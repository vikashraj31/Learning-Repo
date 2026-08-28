#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define SIZE 100000

int partition(int a[], int low, int high)
{
    int pivot = a[high];
    int i = low - 1;
    int temp;

    for (int j = low; j < high; j++)
    {
        if (a[j] <= pivot)
        {
            i++;

            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    temp = a[i + 1];
    a[i + 1] = a[high];
    a[high] = temp;

    return i + 1;
}

void quickSort(int a[], int low, int high)
{
    if (low < high)
    {
        int p = partition(a, low, high);

        quickSort(a, low, p - 1);
        quickSort(a, p + 1, high);
    }
}

int main()
{
    int a[SIZE];

    srand(time(NULL));

    for (int i = 0; i < SIZE; i++)
        a[i] = rand();

    printf("Before sorting:\n");
    for (int i = 0; i < 10; i++)
        printf("%d ", a[i]);

    clock_t start = clock();

    quickSort(a, 0, SIZE - 1);

    clock_t end = clock();

    printf("\n\nAfter sorting:\n");
    for (int i = 0; i < 10; i++)
        printf("%d ", a[i]);

    printf("\n\nTime: %.6f seconds\n",
           (double)(end - start) / CLOCKS_PER_SEC);

    return 0;
}