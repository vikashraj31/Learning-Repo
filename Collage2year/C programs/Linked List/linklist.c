//SLL: Write a program to create a singly linked list and traverse it.
#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int data;
    struct node *next;
}N;

void forprint(N *head){
    if(head==NULL){
        return;
    }
    N *current=head;
    while(current!=NULL){
        printf("%d ",current->data);
        current=current->next;
    }
}

int main() {
    
    N *head, *sec, *thi , *fou;
    
    head=malloc(sizeof(N));
    sec=malloc(sizeof(N));
    thi=malloc(sizeof(N));
    fou=malloc(sizeof(N));
    
    head->data = 10;
    sec->data  = 20;
    thi->data  = 30;
    fou->data  = 40;

    head->next = sec;
    sec->next  = thi;
    thi->next  = fou;
    fou->next  = NULL;
    
    forprint(head);

    return 0;
}
