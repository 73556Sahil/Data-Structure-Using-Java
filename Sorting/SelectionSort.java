package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size;
		size=sc.nextInt();
		int[] arr=new int [size];
		acceptElements(arr);
		System.out.println("Original array is: ");
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Array after selection sorting: ");
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		System.out.println("Array after each iteration: ");
		for(int i=0;i<arr.length-1;i++) {
			int min_idx=i;
			for(int j=(i+1);j<arr.length;j++) {
/*in this case we didn't write j<aar.length-1-i as smallest element is getting position at the start of the 
 * array hence we need to compare the min index till the last element of array*/
				if (arr[j]<arr[min_idx]) {
					min_idx=j;
				}
			}
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void acceptElements(int[] arr) {
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array element at: "+(i+1));
			arr[i]=sc.nextInt();
		}
		
	}

}
