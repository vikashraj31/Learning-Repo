#include <stdio.h>

int gcd(int a, int b)
{
    if(b == 0)
        return a;

    return gcd(b, a % b);
}

int main()
{
    FILE *in, *out;
    int a, b;

    in = fopen("inGcd.dat", "r");
    out = fopen("outGcd.dat", "w");

    while(fscanf(in, "%d %d", &a, &b) != EOF)
    {
        fprintf(out, "The GCD of %d and %d is %d\n", a, b, gcd(a, b));
    }

    fclose(in);
    fclose(out);

    out = fopen("outGcd.dat", "r");

    while((a = fgetc(out)) != EOF)
    {
        printf("%c", a);
    }

    fclose(out);

    return 0;
}