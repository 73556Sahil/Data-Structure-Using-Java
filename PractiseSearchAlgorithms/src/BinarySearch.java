import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
	System.out.println(" Enter Size of the Array");
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	
	int []arr=new int[n];
	acceptdata(arr);
	displaydata(arr);
	System.out.println("Enter Element for Search");
	int s=sc.nextInt();
	int pos=binarySearch(arr,s);
	 if(pos!=-1) 
	 {
		System.out.println("Element found at position"+pos);
	 }
	 else 
	 {
		System.out.println(" Element Not found"); 
	 }
	

	}

	private static int binarySearch(int[] arr, int s) {
		int first=0;
		int last=arr.length-1;
		
		while(first<=last) {
			int mid=(first+last)/2;
			if(arr[mid]==s) 
			{
				return mid+1;
			}
			else if(arr[mid]<s)
			{
				first=(mid+1);
			}
			else if(mid>s) 
			{
				last=(mid-1);
			}
			
		}
		return -1;
		
	}

	private static void displaydata(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void acceptdata(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(" Enter Array Of ELements" +(i+1));
			Scanner sc=new Scanner(System.in);
			arr[i]=sc.nextInt();
		}
		
	}

}
