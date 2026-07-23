#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *L, *R;
};

// Create a new node
struct node *createNode(int value) {
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    newNode->data = value;
    newNode->L = NULL;
    newNode->R = NULL;
    return newNode;
}

// Insert a node into BST
struct node *insert(struct node *root, int value) {
    if (root == NULL) {
        printf("Inserted: %d\n", value);   // 👈 print when new node created
        return createNode(value);
    }

    if (value < root->data)
        root->L = insert(root->L, value);
    else
        root->R = insert(root->R, value);

    return root;
}

// Inorder traversal (prints in sorted order)
void inorder(struct node *root) {
    if (root != NULL) {
        inorder(root->L);
        printf("%d ", root->data);
        inorder(root->R);
    }
}

int main() {
    struct node *root = NULL;

    root = insert(root, 8);
    root = insert(root, 3);
    root = insert(root, 10);
    root = insert(root, 1);
    root = insert(root, 6);
    root = insert(root, 14);

    printf("\nBST elements (inorder): ");
    inorder(root);
    printf("\n");

    return 0;
}
