package SDE_Sheet;

import java.util.Scanner;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		char[] arr = str.toCharArray();
//		int size = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
//					System.out.print(count);
					break;
					
				}
			}
		}
		

	}

}
