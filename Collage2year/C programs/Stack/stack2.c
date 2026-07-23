#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node *next;
} Node;

Node *top = NULL;

void push(int value) {
    Node *newNode = (Node*)malloc(sizeof(Node));
    if (!newNode) {
        printf("Heap Overflow\n");
        return;
    }
    newNode->data = value;
    newNode->next = top;
    top = newNode;
    printf("%d pushed to stack\n", value);
}

int pop() {
    if (top == NULL) {
        printf("Stack Underflow\n");
        return -1;
    }
    int val = top->data;
    Node *temp = top;
    top = top->next;
    free(temp);
    return val;
}

int peek() {
    if (top == NULL) {
        printf("Stack is Empty\n");
        return -1;
    }
    return top->data;
}

void display() {
    if (top == NULL) {
        printf("Stack is Empty\n");
        return;
    }
    Node *temp = top;
    printf("Stack: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main() {
    int choice, value;
    while (1) {
        printf("\n--- Stack Menu ---\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Display\n");
        printf("5. Exit\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to push: ");
                scanf("%d", &value);
                push(value);
                break;
            case 2:
                value = pop();
                if (value != -1)
                    printf("Popped: %d\n", value);
                break;
            case 3:
                value = peek();
                if (value != -1)
                    printf("Top element: %d\n", value);
                break;
            case 4:
                display();
                break;
            case 5:
                exit(0);
            default:
                printf("Invalid choice! Try again.\n");
        }
    }
    return 0;
}
