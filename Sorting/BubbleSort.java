package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int size;
		System.out.println("Enter the size of array: ");
		size=sc.nextInt();
		int []arr=new int [size];
		acceptElements(arr);
		System.out.println("Original array is:");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Array after Bubble sorting:");
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		boolean flag;
		System.out.println("Array after each iteration: ");
		for(int i=0;i<arr.length-1;i++) {
/*in bubble sort the number of iterations required are (arr.length-1) hence i<arr.length-1*/
			flag=false;
			for(int j=0;j<arr.length-1-i;j++) {		
/* (after every iteration the higher value will get set at the right side hence one position will get occupied 
* by one number hence 1 is subtracted from arr.length and also after every iteration second higher value 
* will get set at second last position and so on hence "i" is also subtracted from the arr.length)*/
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			System.out.println(Arrays.toString(arr));
			if(!flag) {
				break;
			}
		}	
	}

	private static void acceptElements(int[] arr) {
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter array element at "+(i+1));
			arr[i]=sc.nextInt();
		}
		
	}

}
