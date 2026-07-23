#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node *next;
} Node;

Node *top = NULL;

void push(int value) {
    Node *newNode = (Node*)malloc(sizeof(Node));
    
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
    push(10);
    push(20);
    push(30);
    display();

    printf("Peek: %d\n", peek());
    printf("Popped: %d\n", pop());
    display();

    return 0;
}
