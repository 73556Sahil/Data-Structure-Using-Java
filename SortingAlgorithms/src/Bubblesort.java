import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort{

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr = new int[n];
	
		for( int i=0;i<arr.length;i++) 
		{
			System.out.println("eneter the element"+(i+1));
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) 
		{
		 System.out.print(arr[i] +" ");
		}
		bubblesort(arr);
		improvedbubblesort(arr);
		
	}

	private static void improvedbubblesort(int[] arr) {
		int n=arr.length;
		for (int i=0; i<arr.length; i++)
		{
			boolean flag=false;
			for ( int j=0; j<n-i-1; j++) 
			{
				if (arr[j]>arr[j+1]) 
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=true;
				}
			}
			if(!flag) {
				break;
			}
			System.out.print(Arrays.toString(arr));
		}
		
	}

	private static void bubblesort(int[] arr) {
		
		
			int n=arr.length;
			for( int i=0;i<n;i++) 
			{
				for(int j=0;j<n-i-1;j++) 
				{
					if(arr[j] >arr[j+1]) 
					{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				}	System.out.print(Arrays.toString(arr));
			
			}
			
	}

}

		
		

