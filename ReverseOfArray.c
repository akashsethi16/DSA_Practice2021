#include<stdio.h>

// Iterative Approach
void swap(int arr[],int i,int j)
{
    int temp;
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

}
void Reverse(int arr[], int n)
{
    int start,end,i;
    start = 0;
    end = n-1;

    while(start!=end && start<end) 
    {
        swap(arr,start,end);

        start = start+1;
        end = end-1;
    }

    
    printf("\nArray after Reversal\n");

    for(i=0;i<n;i++)
    printf("%d ",arr[i]);
}
void main()
{
    int i;
    int a[6] = {1,2,3,4,5,6};
    int n = 6;
    
    printf("Array before Reversal\n");

    for(i=0;i<n;i++)
    printf("%d ",a[i]);

    Reverse(a,n);

    



}