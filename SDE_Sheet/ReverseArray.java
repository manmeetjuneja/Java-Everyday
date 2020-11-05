package SDE_Sheet;

import java.util.Scanner;

public class ReverseArray {
	
	static void reverse(int arr[], int start, int end) {
		int temp;
		//using recursion
		if(start>=end) return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverse(arr, start+1, end-1);
		
		
		//without recursion.
//		while(start<end) {
//			temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//		}
		}
	static void printArray(int arr[], int size) {
		for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
	System.out.println();	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Original array is :");
		printArray(arr,size);
		int start = 0;
		int end = size-1;
//		System.out.println("     "+start +" "+end);
		System.out.println("Reverse array is :");
		reverse(arr, start, end);
		printArray(arr, size);
		
	}

}
