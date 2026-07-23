#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node *next;
} node;

node *front = NULL, *rear = NULL;

void enque(int x) {
    node *temp = (node *)malloc(sizeof(node));
    temp->data = x;
    temp->next = NULL;

    if (rear == NULL) {
        front = rear = temp;
    } else {
        rear->next = temp;
        rear = temp;
    }
}

int deque() {
    if (front == NULL) {
        printf("Queue Underflow\n");
        return -1;
    }
    int x = front->data;
    node *temp = front;
    front = front->next;
    if (front == NULL)
        rear = NULL;
    free(temp);
    return x;
}

int main() {
    enque(3);
    enque(44);
    enque(2);
    enque(11);

    int x = deque();   // ✅ store dequeued value
    printf("Dequeued: %d\n", x);

    return 0;
}
