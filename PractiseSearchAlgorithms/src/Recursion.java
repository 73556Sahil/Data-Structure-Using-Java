import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
	System.out.println(" Enter size of Array");
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	acceptdata(arr);
	displaydata(arr);
	
	System.out.println(" Enter Elements to binary Search through Recurrsion");
	int s=sc.nextInt();
	int first=0;
	int last=arr.length-1;
	int pos=searchelementrecursive(first,last,arr,s);
	if(pos!=-1)
	{
		System.out.println("Element found at Posotion = "+(++pos));
	}else
	{
		System.out.println("Element not found");
	}

}

	
	private static void acceptdata(int[] arr)
	{
		for (int i=0; i<arr.length;i++) {
			System.out.println(" Enter Elememnts of array");
			Scanner sc=new Scanner(System.in);
		    arr[i]=sc.nextInt();
		}
	}

	private static void displaydata(int[] arr)
	{
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
		
	private static int searchelementrecursive(int first, int last, int[] arr, int s) 
	{
			if(first>last) 
			{
				return -1;
			}
			else {
				int mid=(first+last)/2;
				
				 if(arr[mid]==s)
				 {
					return mid;
				 }
				 else if(arr[mid]<s)
				 {
					 first =(mid+1);
					 return searchelementrecursive(first,last,arr,s);
				 }
				 else 
				 {
					 last=(mid-1);
					 return searchelementrecursive(first,last,arr,s);
				 
				 }
		
			}
		}
}	
	

	
		
	


