#include <stdio.h>

void binary(int n)
{
    if(n > 1)
        binary(n / 2);

    printf("%d", n % 2);
}

int main()
{
    FILE *fp;
    int n, i, num;

    fp = fopen("inDec.dat", "r");

    printf("Enter how many numbers to read: ");
    scanf("%d", &n);

    for(i = 1; i <= n; i++)
    {
        fscanf(fp, "%d", &num);

        printf("The binary equivalent of %d is ", num);
        binary(num);
        printf("\n");
    }

    fclose(fp);

    return 0;
}