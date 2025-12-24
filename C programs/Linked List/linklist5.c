#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *prev;
    struct node *next;
} Node;

void printForward(Node *head) {
    Node *temp = head;
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

void insert(Node **head) {
    if (head == NULL)
        return;
    
    Node *newNode = malloc(sizeof(Node));
    newNode->data = 22;
    newNode->prev = NULL;
    newNode->next = *head;

     if (*head != NULL)
        (*head)->prev = newNode;


    *head = newNode;
}

int main() {
    Node *head, *sec, *thi, *fou;

    head = malloc(sizeof(Node));
    sec  = malloc(sizeof(Node));
    thi  = malloc(sizeof(Node));
    fou  = malloc(sizeof(Node));

    head->data = 10;
    sec->data  = 20;
    thi->data  = 30;
    fou->data  = 40;

    head->next = sec;
    sec->next  = thi;
    thi->next  = fou;
    fou->next  = NULL;

    head->prev = NULL;
    sec->prev  = head;
    thi->prev  = sec;
    fou->prev  = thi;

    printf("Before insertion:\n");
    printForward(head);

    insert(&head);

    printf("After insertion:\n");
    printForward(head);

    return 0;
}
