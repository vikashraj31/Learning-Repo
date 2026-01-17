#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *L, *R;
};

struct node* createNode(int value) {
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = value;
    newNode->L = NULL;
    newNode->R = NULL;
    return newNode;
}

struct node* insert(struct node* root, int value) {
    if (root == NULL) {
        printf("Inserted: %d\n", value);
        return createNode(value);
    }

    if (value < root->data)
        root->L = insert(root->L, value);
    else
        root->R = insert(root->R, value);

    return root;
}

struct node* search(struct node* root, int key) {
    if (root == NULL || root->data == key)
        return root;

    if (key < root->data)
        return search(root->L, key);
    else
        return search(root->R, key);
}

void inorder(struct node* root) {
    if (root != NULL) {
        inorder(root->L);
        printf("%d ", root->data);
        inorder(root->R);
    }
}

int main() {
    struct node* root = NULL;

    // Insert values
    root = insert(root, 8);
    root = insert(root, 3);
    root = insert(root, 10);
    root = insert(root, 1);
    root = insert(root, 6);
    root = insert(root, 14);

    printf("\nBST (inorder): ");
    inorder(root);
    printf("\n");

    // Search for a key
    int key = 6;
    struct node* found = search(root, key);
    if (found != NULL)
        printf("Found: %d\n", found->data);
    else
        printf("Not found: %d\n", key);

    key = 7;
    found = search(root, key);
    if (found != NULL)
        printf("Found: %d\n", found->data);
    else
        printf("Not found: %d\n", key);

    return 0;
}
