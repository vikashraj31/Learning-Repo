#include <stdio.h>

int main() {
    int n, cap;
    int w[20], p[20];
    float r[20], profit = 0;

    printf("Enter number of items: ");
    scanf("%d", &n);

    printf("Enter weight and profit:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d %d", &w[i], &p[i]);
        r[i] = (float)p[i] / w[i];
    }

    printf("Enter capacity: ");
    scanf("%d", &cap);

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (r[i] < r[j]) {
                float t = r[i];
                r[i] = r[j];
                r[j] = t;

                t = w[i];
                w[i] = w[j];
                w[j] = t;

                t = p[i];
                p[i] = p[j];
                p[j] = t;
            }
        }
    }

    for (int i = 0; i < n; i++) {
        if (w[i] <= cap) {
            cap -= w[i];
            profit += p[i];
        } else {
            profit += r[i] * cap;
            break;
        }
    }

    printf("Maximum Profit = %.2f", profit);

    return 0;
}