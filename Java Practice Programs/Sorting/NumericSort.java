package Sorting;

import java.util.Scanner;
public class NumericSort {

	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		size = sc.nextInt();
		int array[] = new int[size]; 
		System.out.println("Enter elements :");
		for (int i = 0; i <=(size-1); i++) {
			array[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		// ascending sort.
		for (int i = 0;  i< array.length; i++) {
			System.out.print(array[i]+" ");
		}	
		// descending sort.
//		for (int i = (array.length-1);  i>=0; i--) {
//			System.out.print(array[i]+" ");
//		}	
	}

}
