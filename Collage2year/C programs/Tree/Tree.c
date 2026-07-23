#include <stdio.h>
#include<stdlib.h>

typedef struct node{
    int data;
    struct node *left , *right;
}tree;

tree *creatnode(int x){
    tree *new;
    new=malloc(sizeof(tree));
    new->data=x;
    new->left=NULL;
    new->right=NULL;
    
    return new;
}

int main() {
    tree *root;
    root=creatnode(10);
    root->left=creatnode(93);
    root->right=creatnode(22);
    printf("Root: %d\n", root->data);
    printf("Left Child: %d\n", root->left->data);
    printf("Right Child: %d\n", root->right->data);

    
    return 0;
    

}

