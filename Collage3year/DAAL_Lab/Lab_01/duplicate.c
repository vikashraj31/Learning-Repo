#include <stdio.h>

int main()
{
    FILE *fp;
    int arr[100];
    int n, i, j;
    int count, duplicate = 0;
    int max = 0, element;

    fp = fopen("input2.txt", "r");

    printf("Enter how many numbers you want to read from file: ");
    scanf("%d", &n);

    for(i = 0; i < n; i++)
    {
        fscanf(fp, "%d", &arr[i]);
    }

    fclose(fp);

    printf("The content of the array: ");
    for(i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    printf("\n");

    for(i = 0; i < n; i++)
    {
        count = 1;

        for(j = i + 1; j < n; j++)
        {
            if(arr[i] == arr[j])
                count++;
        }

        if(count > 1)
        {
            int first = 1;

            for(j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    first = 0;
                    break;
                }
            }

            if(first)
            {
                duplicate++;

                if(count > max)
                {
                    max = count;
                    element = arr[i];
                }
            }
        }
    }

    printf("Total number of duplicate values = %d\n", duplicate);
    printf("The most repeating element in the array = %d\n", element);

    return 0;
}