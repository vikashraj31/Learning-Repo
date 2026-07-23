#include <stdio.h>
#define size 5

int arr[size];
int front = -1, rear = -1;

void enqueue(int x) {
    if ((rear + 1) % size == front) {
        printf("Queue Overflow\n");
        return;
    }

    if (front == -1) { // First element
        front = rear = 0;
    } else {
        rear = (rear + 1) % size;
    }

    arr[rear] = x; // ✅ fixed index
}

int deque() {
    if (front == -1) {
        printf("Queue Underflow\n");
        return -1;
    }

    int x = arr[front];

    if (front == rear) {
        front = rear = -1; // Queue becomes empty
    } else {
        front = (front + 1) % size;
    }

    return x;
}

void display() {
    if (front == -1) {
        printf("Queue is empty\n");
        return;
    }

    printf("Queue elements: ");
    int i = front;
    while (1) {
        printf("%d ", arr[i]);
        if (i == rear)
            break;
        i = (i + 1) % size;
    }
    printf("\n");
}

int main() {
    enqueue(2);
    enqueue(1);
    enqueue(44);
    enqueue(7);
    enqueue(9); // Queue full here

    display();

    deque();
    int x = deque();
    printf("Dequeued: %d\n", x);

    display();
    return 0;
}
