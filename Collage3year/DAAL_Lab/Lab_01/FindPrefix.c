#include <stdio.h>

int main()
{
    int arr[5] = {3, 4, 5, 1, 2};
    int prefixSum[5];


    prefixSum[0] = arr[0];

    for (int i = 1; i < 5; i++)
    {
        prefixSum[i] = prefixSum[i - 1] + arr[i];
    }

    printf("Prefix Sum Array: ");

    for (int i = 0; i < 5; i++)
    {
        printf("%d ", prefixSum[i]);
    }

    return 0;
}