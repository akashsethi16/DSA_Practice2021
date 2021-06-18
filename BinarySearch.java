
public class BinarySearch {
	
	static int bSearch(int arr[], int low, int high, int key)
	{
		
		
		int mid = (low+high)/2;
		
		if(arr[mid]==key)
		{
			return mid;
		}
		
		else if(key < arr[mid])
			return bSearch(arr,low,mid-1,key);
		else
			return bSearch(arr,mid+1,high,key);
		
		
	}

	public static void main(String []args)
	{
		int a[] = new int[] {1,2,3,4,5,6};
		
		System.out.println(bSearch(a,0,5,6));
	}
}
