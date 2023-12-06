package Searching;

import java.util.Scanner;

public class LinearSearch {
	

	private static int linearsearch(int[] arr, int key) {
		for(int i=0; i<arr.length; i++)
		{
			if(key==arr[i]) 
				return i;
		}
		return -1;
	}
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int []arr= {11,22,33,44,55,66,77,88};
		
		System.out.println("Enter key to search :");
		int key=sc.nextInt();
		
		int index=linearsearch(arr,key);
		if(index!=-1) {
			System.out.println("Key found at index: "+ index );
			System.out.println("Key is: "+ key);
		}
		else {
			System.out.println("Key not found ");
			}
	}

}
