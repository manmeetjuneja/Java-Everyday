package Number;

import java.util.Scanner;

public class MinMaxNo {

	public static void main(String[] args) {
		//Program to find the min and max of an array
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array :");
		int size = sc.nextInt();
		int array[] = new int[size];	// runtime array allocation.
		for(int i=0;i<=(size-1);i++) {
			array[i] = sc.nextInt();
		}
														//		System.out.println("Elements are :");
														//		for (int i = 0; i <=(array.length-1); i++) {
														//			System.out.print(array[i]+" ");
														//		}
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("minimum no is :"+min);
		System.out.println("maximum no is :"+max);

	}

}
