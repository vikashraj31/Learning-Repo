#include <stdio.h>

struct Activity {
    int start, finish;
};

int main() {
    int n;

    printf("Enter number of activities: ");
    scanf("%d", &n);

    struct Activity a[n];

    printf("Enter start and finish time:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d %d", &a[i].start, &a[i].finish);
    }

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (a[i].finish > a[j].finish) {
                struct Activity temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    printf("\nSelected activities:\n");

    int last = 0;

    for (int i = 0; i < n; i++) {
        if (a[i].start >= last) {
            printf("(%d, %d)\n", a[i].start, a[i].finish);
            last = a[i].finish;
        }
    }

    return 0;
}