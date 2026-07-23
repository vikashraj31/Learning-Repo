#include <stdio.h>
#define size 10 // simple size of array

// creating array
int arr[size];
int front = -1;
int rear = -1;

// check if empty
int isEmpty() {
    return (front == -1 || front > rear);
}

// check if full
int full() {
    return (rear == size - 1);  // ✅ fixed comparison
}

// push (Enqueue)
void Enqueue(int x) {
    if (full()) {
        printf("Sorry, queue is full\n");
        return;
    }

    if (front == -1) {
        front = 0;
    }

    rear++;
    arr[rear] = x;
    printf("Enqueued %d\n", x);
}

// pop (Dequeue)
int Dequeue() {
    if (isEmpty()) {
        printf("Queue Underflow\n");
        return -1;
    }

    int x = arr[front];
    front++;
    return x;
}

int main() {
    Enqueue(8);
    printf("Last Enqueued: %d\n", arr[rear]);

    int removed = Dequeue();
    printf("Dequeued: %d\n", removed);   // ✅ fixed printf

    return 0;
}
