package SDE_Sheet;

import java.util.Scanner;

public class ArraySort01 {

	static void sort(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		size = sc.nextInt();
		System.out.println("enter elements 0 and 1 only");
		int arr[] = new int[size];
		for (int i = 0; i < size;i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		

	}

}
