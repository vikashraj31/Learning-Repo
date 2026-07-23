//CLL: Write a program to create a circular linked list and traverse it.
#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int data;
    struct node *next;
    struct node *pre;
} N;

void forprint(N *head){
    if (head == NULL) return;

    N *current = head;
    do {
        printf("%d ", current->data);
        current = current->next;
    } while (current != head);
    printf("\n");
}

int main() {
    N *head, *sec, *thi, *fou;

    head = malloc(sizeof(N));
    sec  = malloc(sizeof(N));
    thi  = malloc(sizeof(N));
    fou  = malloc(sizeof(N));

    head->data = 10; head->pre = fou;
    sec->data  = 20; sec->pre = head;
    thi->data  = 30; thi->pre = sec;
    fou->data  = 40; fou->pre = thi;

    head->next = sec;
    sec->next  = thi;
    thi->next  = fou;
    fou->next  = head;  // circular

    printf("Circular list: ");
    forprint(head);

    return 0;
}
