package SDE_Sheet;

import java.util.Scanner;

public class NegativeOneSide {

	static void arrange(int arr[]) {
		int j=0,temp;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				if(i!=j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
				j++;
			}
		}
	}
	
	static void print(int arr[]) {
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array");
		size = sc.nextInt();
		int arr[] = new int[size];
//		array input as = -12, 11, -13, -5, 6, -7, 5, -3, -6
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before");
		print(arr);
		System.out.println("Array After");
		arrange(arr);
		print(arr);
		
	}

}
