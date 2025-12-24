#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *next;
} N;

// Function to traverse and print the circular linked list
void forprint(N *head) {
    if (head == NULL) return;

    N *current = head;
    do {
        printf("%d ", current->data);
        current = current->next;
    } while (current != head);
    printf("\n");
}

// Function to insert a new node at the end
void insert(N **head, int value) {
    N *newNode = malloc(sizeof(N));
    newNode->data = value;

    if (*head == NULL) {
        *head = newNode;
        newNode->next = newNode; // circular
        return;
    }

    N *temp = *head;
    while (temp->next != *head) {  // stop at last node
        temp = temp->next;
    }

    temp->next = newNode;
    newNode->next = *head;
}

int main() {
    N *head = NULL;

    // Creating initial circular linked list manually
    insert(&head, 10);
    insert(&head, 20);
    insert(&head, 30);
    insert(&head, 40);

    printf("Circular list: ");
    forprint(head);

    // Insert a new node
    insert(&head, 12);

    printf("After insertion: ");
    forprint(head);

    return 0;
}
