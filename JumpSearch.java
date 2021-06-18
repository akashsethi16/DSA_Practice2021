import java.util.Scanner;
import java.lang.Math;

public class JumpSearch {
	
	static int jSearch(int arr[], int key)
	{
		
		int n = arr.length;
		
		int step = (int)Math.floor(Math.sqrt(n));
		
		int prev =0;
		int flag =0;
		
//		Finding block which contains key
		while(arr[Math.min(n, step)-1]< key)
		{
			prev = step;
			step = step + (int)Math.floor(Math.sqrt(n));
			
			if(prev >=n)
				flag=0;
			
		}
		
		//Linear search in the block
		for(int i=prev;i<(int)Math.min(step,n);i++)
		{
			if(arr[i] == key)
			{
				flag = i;
				
			}
			
		}
		
		if(flag == 0)
			return -1;
		else
			return flag;
		
		
	}
	
	public static void main(String []args)
	{
		System.out.println("Enter the size of array");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter the elements of array");
		
		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
			
		}
		
		
		System.out.println("Enter the element to be searched ");
		
		int k = sc.nextInt();
		
		sc.close();
		
		int pos = jSearch(a,k);
		
		if(pos==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at :" + pos);
		
	}

}
