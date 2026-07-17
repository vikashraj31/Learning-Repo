#include <stdio.h>

void SwapArray(int *p, int *q)
{
    int temp = *p;
    *p = *q;
    *q = temp;
}

void ROTATE_RIGHT(int arr[], int n)
{
    int i;
    for(i = n - 1; i > 0; i--)
    {
        SwapArray(&arr[i], &arr[i - 1]);
    }
}

void Print(int arr[], int size)
{
    int i;
    for(i = 0; i < size; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main()
{
    int arr[] = {11,22,33,44,55,66,77,88,99};
    int size = 9;
    int n;

    printf("Enter number of elements to rotate: ");
    scanf("%d", &n);

    printf("Before ROTATE: ");
    Print(arr, size);

    ROTATE_RIGHT(arr, n);

    printf("After ROTATE: ");
    Print(arr, size);

    return 0;
}