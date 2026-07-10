#include <stdio.h>

int main()
{
    FILE *file;
    int n, i, j, temp;

    file = fopen("input.txt", "r");

    fscanf(file, "%d", &n);

    int arr[n];

    for (i = 0; i < n; i++)
    {
        fscanf(file, "%d", &arr[i]);
    }

    fclose(file);

    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    printf("Second Smallest = %d\n", arr[1]);
    printf("Second Largest = %d", arr[n - 2]);

    return 1;
}