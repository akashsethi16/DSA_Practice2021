import java.util.Scanner;
public class LinearSearch {
	
	public static int linearSearch(int arr[], int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]== key)
				return i;
		}
		
		return -1;
		
	}

	public static void main(String... a1)
	{
		int a[]= new int[]{10,9,5,8,1,3};
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();
		int pos = linearSearch(a,k);
		
		
		if(pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index"+ pos);
		
		
	}
}
