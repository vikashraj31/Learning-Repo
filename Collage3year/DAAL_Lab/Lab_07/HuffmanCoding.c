#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Node {
    char ch;
    int freq;
    struct Node *left, *right;
};

struct Node* createNode(char ch, int freq) {
    struct Node* node = (struct Node*)malloc(sizeof(struct Node));
    node->ch = ch;
    node->freq = freq;
    node->left = NULL;
    node->right = NULL;
    return node;
}

void swap(struct Node** a, struct Node** b) {
    struct Node* temp = *a;
    *a = *b;
    *b = temp;
}

void minHeapify(struct Node* heap[], int n, int i) {
    int smallest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < n && heap[left]->freq < heap[smallest]->freq)
        smallest = left;

    if (right < n && heap[right]->freq < heap[smallest]->freq)
        smallest = right;

    if (smallest != i) {
        swap(&heap[i], &heap[smallest]);
        minHeapify(heap, n, smallest);
    }
}

struct Node* extractMin(struct Node* heap[], int* n) {
    struct Node* temp = heap[0];
    heap[0] = heap[*n - 1];
    (*n)--;
    minHeapify(heap, *n, 0);
    return temp;
}

void insertHeap(struct Node* heap[], int* n, struct Node* node) {
    int i = *n;
    heap[i] = node;
    (*n)++;

    while (i > 0 && heap[(i - 1) / 2]->freq > heap[i]->freq) {
        swap(&heap[i], &heap[(i - 1) / 2]);
        i = (i - 1) / 2;
    }
}

void printCodes(struct Node* root, int code[], int top) {
    if (root->left) {
        code[top] = 0;
        printCodes(root->left, code, top + 1);
    }

    if (root->right) {
        code[top] = 1;
        printCodes(root->right, code, top + 1);
    }

    if (!root->left && !root->right) {
        printf("%c : ", root->ch);
        for (int i = 0; i < top; i++)
            printf("%d", code[i]);
        printf("\n");
    }
}

struct Node* buildHuffman(char chars[], int freq[], int n) {
    struct Node* heap[100];
    int size = 0;

    for (int i = 0; i < n; i++)
        insertHeap(heap, &size, createNode(chars[i], freq[i]));

    while (size > 1) {
        struct Node* left = extractMin(heap, &size);
        struct Node* right = extractMin(heap, &size);

        struct Node* parent = createNode('$', left->freq + right->freq);
        parent->left = left;
        parent->right = right;

        insertHeap(heap, &size, parent);
    }

    return heap[0];
}

int main() {
    char chars[] = {'A', 'B', 'C', 'D', 'E', 'F'};
    int freq[] = {5, 9, 12, 13, 16, 45};
    int n = 6;

    struct Node* root = buildHuffman(chars, freq, n);

    int code[100];

    printf("Huffman Codes:\n");
    printCodes(root, code, 0);

    return 0;
}