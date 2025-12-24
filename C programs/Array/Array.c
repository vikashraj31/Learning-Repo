// Find the maximum and minimum element in an array.
#include <stdio.h>

int main() {
   int arr[]={2,4,123,5};
   int n=sizeof(arr)/sizeof(arr[0]);
   int max=arr[0];
   int min=arr[0];
   for(int i=1;i<n;i++){
       if(arr[i]>max){
           max=arr[i];
       }
       
       if(arr[0]>min){
           min=arr[i];
       }
   }
   printf("%d is max\n",max);
   printf("%d is min",min);
    return 0;
}