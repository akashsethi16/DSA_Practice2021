#include<stdio.h>

void fixArray(int arr[], int n)
{

    int i,j;
    int temp =0;

    printf("Array before transfprmation \n");

    for(i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }

    //Array Iteration

    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(arr[j]==i)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

    }

    for(i=0;i<n;i++)
    {
        if(arr[i]!= i)
        {
            arr[i] = -1;
        }
    }

    printf("\n Array after Rearrangement \n");

    for(i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }


}

void main()
{
    int n;
    int a[10] = {-1,-1,6,1,9,3,2,-1,4,-1};
    n= 10;

    fixArray(a,n);

}