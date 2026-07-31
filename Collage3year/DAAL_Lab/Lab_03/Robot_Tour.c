#include <stdio.h>
#include <math.h>
#include <stdbool.h>

int main()
{
    int n, i, j, current = 0, next;
    double x[100], y[100], dist[100][100];
    double total = 0;
    bool visited[100] = {false};

    printf("Enter number of locations: ");
    scanf("%d", &n);

    // Input coordinates
    for(i = 0; i < n; i++)
    {
        printf("Enter x and y of location %d: ", i);
        scanf("%lf %lf", &x[i], &y[i]);
    }

    // Calculate distance matrix
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        {
            dist[i][j] = sqrt((x[i]-x[j])*(x[i]-x[j]) +
                              (y[i]-y[j])*(y[i]-y[j]));
        }
    }

    visited[0] = true;

    printf("\nPath: 0 ");

    // Find nearest unvisited location
    for(i = 1; i < n; i++)
    {
        double min = 1000000;

        for(j = 0; j < n; j++)
        {
            if(visited[j] == false && dist[current][j] < min)
            {
                min = dist[current][j];
                next = j;
            }
        }

        visited[next] = true;
        total += min;
        current = next;

        printf("-> %d ", current);
    }

    // Return to starting point
    total += dist[current][0];
    printf("-> 0");

    printf("\nTotal Distance = %.2lf\n", total);
    printf("Time Complexity = O(N^2)\n");
    printf("Space Complexity = O(N^2)\n");

    return 0;
}