// 🌳 Program: Binary Search Tree (BST)
// ✅ Features:
// 1. Insert nodes into a BST
// 2. Display tree using Inorder Traversal
// 3. Count number of Leaf Nodes
// Author: Vikash
// Language: C

#include <stdio.h>
#include <stdlib.h>

// Define structure for a tree node
typedef struct tree {
    int data;
    struct tree *l, *r;
} tree;

// Create a new node
tree *create(int x) {
    tree *newNode = (tree *)malloc(sizeof(tree));
    newNode->data = x;
    newNode->l = newNode->r = NULL;
    return newNode;
}

// Insert a node into BST
tree *insert(tree *root, int x) {
    if (root == NULL)
        return create(x);

    if (x > root->data)
        root->r = insert(root->r, x);
    else
        root->l = insert(root->l, x);

    return root; // return updated root
}

// Inorder traversal (Left → Root → Right)
void inorder(tree *root) {
    if (root != NULL) {
        inorder(root->l);
        printf("%d ", root->data);
        inorder(root->r);
    }
}

// Count total number of leaf nodes
int countLeaf(tree *root) {
    if (root == NULL)
        return 0;

    // If both children are NULL → it's a leaf
    if (root->l == NULL && root->r == NULL)
        return 1;

    // Count leaves in both subtrees
    return countLeaf(root->l) + countLeaf(root->r);
}

// Main function
int main() {
    tree *root = NULL;

    // Insert elements into BST
    root = insert(root, 3);
    root = insert(root, 10);
    root = insert(root, 1);
    root = insert(root, 6);
    root = insert(root, 14);

    // Display inorder traversal
    printf("Inorder traversal: ");
    inorder(root);
    printf("\n");

    // Display number of leaf nodes
    int leafCount = countLeaf(root);
    printf("Number of leaf nodes = %d\n", leafCount);

    return 0;
}
