//Insert a node at start in SLL
#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *next;
} N;

void print(struct node *head) {
    if (head == NULL)
        return;

    struct node *new = head;
    while (new != NULL) {
        printf("%d ", new->data);
        new = new->next;
    }
    printf("\n");
}

void insertAtStart(struct node **head, int value) {
    if (head == NULL)
        return;

    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    if (!newNode) {
        printf("Memory allocation failed\n");
        return;
    }

    newNode->data = value;
    newNode->next = *head;
    *head = newNode;
}

int main() {
    struct node *head, *sec, *thi, *fou;

    head = malloc(sizeof(N));
    sec  = malloc(sizeof(N));
    thi  = malloc(sizeof(N));
    fou  = malloc(sizeof(N));

    head->data = 10;
    sec->data  = 20;
    thi->data  = 30;
    fou->data  = 40;

    head->next = sec;
    sec->next  = thi;
    thi->next  = fou;
    fou->next  = NULL;

    printf("Before insertion:\n");
    print(head);

    // Insert new nodes at start
    insertAtStart(&head, 2);
    insertAtStart(&head, 1);

    printf("After insertion:\n");
    print(head);

    return 0;
}
