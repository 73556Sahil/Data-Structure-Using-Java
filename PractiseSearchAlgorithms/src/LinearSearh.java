import java.util.Scanner;

public class LinearSearh {

	public static void main(String[] args) {
		System.out.println("Enter Array Size");
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int []arr=new int [n];
		acceptData(arr);
		displayData(arr);
		System.out.println(" Enter element for Search");
		int search=sc.nextInt();
		int pos=linearSearch(arr,search);
		if(pos!=-1) {
			System.out.println("Element found At position " +pos);
		}else {
			System.out.println("Element Not found");
		}

	}

	private static int linearSearch(int[] arr, int search) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==search) {
				return i+1;
			}
		}
		return -1;
		
	}

	private static void displayData(int[] arr) {
		
		for(int i=0; i<arr.length; i++) 
		{
		System.out.print(arr[i]+" ");
		}
		
	}

	private static void acceptData(int[] arr) {
		
		for(int i=0; i<arr.length; i++) 
		{
		System.out.println(" Enter Array of elements"+(i+1));
		Scanner sc=new Scanner(System.in);
		arr[i]=sc.nextInt();
		}
		
	}

}
