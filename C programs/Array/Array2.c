//Reverse an array.
//Example: arr = [1, 2, 3, 4] → [4, 3, 2, 1]

#include<stdio.h>
int main(){
    int arr[]={2,4,3,5,6};
    int n=sizeof(arr)/sizeof(arr[0]);
    int reverse[n];
    for(int i=0;i<n;i++){
        reverse[i]=arr[n-1-i];
    }
    for(int i=0;i<n;i++)
    printf("%d\n", reverse[i]);
    return 0;
}