package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	
	
	private static void selectionsort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {6,4,2,8,3,1};
		System.out.println("Selection Sort" + Arrays.toString(arr));
		System.out.println("Before :" + Arrays.toString(arr));
		selectionsort(arr);
		System.out.println("After :" + Arrays.toString(arr));
	}

	
}
