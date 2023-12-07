package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class recursiveBinarySearch {

	private static int recbinarysearch(int[] arr, int left , int right, int key) {
		
		if(right<left)
			return -1;
		
		int index;
		int mid=(left+right)/2;
		if(key==arr[mid])
			return mid;
		
		if(key<arr[mid])
			index=recbinarysearch(arr,left,mid-1,key);
		else
			index=recbinarysearch(arr,mid+1,right,key);
		return index;
		}
	
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {11,22,33,44,55,66,77,88,99};
		Arrays.sort(arr);
		
		System.out.println("Enter key to seaerch: ");
		int key=sc.nextInt();
		
		int index=recbinarysearch(arr,0,arr.length,key);
		if(index!= -1)
			System.out.println("key found at index: "+index);

		else
			System.out.println("key not found");
	}

	

}
