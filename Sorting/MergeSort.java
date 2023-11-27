package Sorting;
//[45, 32, 20, 59, 34]
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int size;
		System.out.println("Enter the size of array: ");
		size =sc.nextInt();
		int [] arr=new int[size];
		acceptArrElements(arr);
		System.out.println("Original array is: ");
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println("Sorted Array is: ");
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr, int start, int end) {
		if(start<end) {
		int mid=(start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		mergeData(arr,start,end,mid);
		}
		
	}

	private static void mergeData(int[] arr, int start, int end, int mid) {
		int n1=mid-start+1;
		int n2=end-mid;
		int [] leftarr=new int[n1];
		for(int i=0;i<n1;i++) {
			leftarr[i]=arr[start+i];
		}
		int [] rightarr=new int[n2];
		for(int j=0;j<n2;j++) {
			rightarr[j]=arr[mid+1+j];
		}
		int i=0,j=0,k=start;
		while(i<n1 && j<n2) {
			if(leftarr[i]<rightarr[j]) {
				arr[k]=leftarr[i];
				i++;k++;
			}else {
				arr[k]=rightarr[j];
				j++;k++;
			}
		}
		while(i<n1) {
			arr[k]=leftarr[i];
			k++;i++;
		}
		while(j<n2) {
			arr[k]=rightarr[j];
			k++;j++;
		}
	}

	private static void acceptArrElements(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the arr element at: "+(i+1));
			arr[i]=sc.nextInt();
		}
		
	}

}
