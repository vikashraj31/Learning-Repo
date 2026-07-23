#include <stdio.h>
#include <time.h>

int main()
{
    int arr[100];
    int n, key, i;
    int found = 0;
    clock_t start, end;
    double cpu_time;

    
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    
    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++)
    {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }

    
    printf("Enter the element to search: ");
    scanf("%d", &key);

    
    start = clock();

    
    for(i = 0; i < n; i++)
    {
        if(arr[i] == key)
        {
            found = 1;
            break;
        }
    }

    
    end = clock();

    
    cpu_time = (double)(end - start) / CLOCKS_PER_SEC;

    
    if(found)
        printf("\nElement %d found at position %d.\n", key, i + 1);
    else
        printf("\nElement %d not found.\n", key);

    printf("Execution Time = %lf seconds\n", cpu_time);

    return 0;
}

