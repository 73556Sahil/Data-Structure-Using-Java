package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array: ");
		int size;
		size=sc.nextInt();
		int [] arr=new int [size];
		acceptelements(arr);
		System.out.println("Original array is: ");
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Array after insertion sorting:");
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		System.out.println("Array after each iteration: ");
/*'i' start with first element of the unsorted portion of array*/
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			for (;j>=0 && arr[j]>key;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void acceptelements(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element at: "+(i+1));
			arr[i]=sc.nextInt();
		}
		
	}
}
