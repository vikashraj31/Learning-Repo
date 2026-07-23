#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *next;
    struct node *pre;
} N;

// Traverse forward
void forprint(N *head) {
    N *current = head;
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}


// Insert a new node at the end
void insert(N **head) {
    N *newN = malloc(sizeof(N));
    newN->data = 11;
    newN->next = NULL;
    newN->pre = NULL;

    if (*head == NULL) { 
        *head = newN;
        return;
    }
    
    N *temp = *head;
    while (temp->next != NULL) {  
        temp = temp->next;
    }

    temp->next = newN;
    newN->pre = temp;
    
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

    insert(&head);

    printf("After Insert (Forward): ");
    forprint(head);

    return 0;
}
