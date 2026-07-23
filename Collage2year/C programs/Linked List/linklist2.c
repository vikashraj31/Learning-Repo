//DLL: Write a program to create a doubly linked list and traverse it (both forward and backward).
#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *next;
    struct node *pre;
} N;

void forprint(N *head) {
    N *current = head;
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

void backprint(N *tail) {
    N *current = tail;
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->pre;
    }
    printf("\n");
}

int main() {
    N *head, *sec, *thi, *fou;

    head = malloc(sizeof(N));
    sec  = malloc(sizeof(N));
    thi  = malloc(sizeof(N));
    fou  = malloc(sizeof(N));

    if (!head || !sec || !thi || !fou) {
        perror("malloc failed");
        return 1;
    }

    head->data = 10;
    sec->data  = 20;
    thi->data  = 30;
    fou->data  = 40;

    head->next = sec; head->pre = NULL;
    sec->next  = thi; sec->pre = head;
    thi->next  = fou; thi->pre = sec;
    fou->next  = NULL; fou->pre = thi;

    printf("Forward: ");
    forprint(head);

    printf("Backward: ");
    backprint(fou);

    free(fou);
    free(thi);
    free(sec);
    free(head);

    return 0;
}
