#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define SIZE 100000

void heapify(int a[], int n, int i)
{
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int temp;

    if (left < n && a[left] > a[largest])
        largest = left;

    if (right < n && a[right] > a[largest])
        largest = right;

    if (largest != i)
    {
        temp = a[i];
        a[i] = a[largest];
        a[largest] = temp;

        heapify(a, n, largest);
    }
}

void heapSort(int a[], int n)
{
    int temp;

    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(a, n, i);

    for (int i = n - 1; i > 0; i--)
    {
        temp = a[0];
        a[0] = a[i];
        a[i] = temp;

        heapify(a, i, 0);
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

    heapSort(a, SIZE);

    clock_t end = clock();

    printf("\n\nAfter sorting:\n");
    for (int i = 0; i < 10; i++)
        printf("%d ", a[i]);

    printf("\n\nTime: %.6f seconds\n",
           (double)(end - start) / CLOCKS_PER_SEC);

    return 0;
}