#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node *next;
} N;

void printCLL(N *head) {
    if (head == NULL)
        return;
        
    N *current = head;
    do {
        printf("%d ", current->data);
        current = current->next;
    } while (current != head);
    printf("\n");
}

// Insert at end
void insertEnd(N **head, int value) {
    N *newN = malloc(sizeof(N));
   
    newN->data = value;

    if (*head == NULL) {  
        newN->next = newN;
        *head = newN;
        return;
    }

    N *temp = *head;
    while (temp->next != *head) {
        temp = temp->next;
    }

    temp->next = newN;
    newN->next = *head;
}

int main() {
    N *head = NULL;

    insertEnd(&head, 10);
    insertEnd(&head, 20);
    insertEnd(&head, 30);
    insertEnd(&head, 40);

    printf("Circular Linked List: ");
    printCLL(head);

    insertEnd(&head, 50);
    printf("After Insert at End: ");
    printCLL(head);

    return 0;
}
