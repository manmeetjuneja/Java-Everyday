package SDE_Sheet;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str,reverse="";
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		char[] arr = str.toCharArray();
		for (int i = (arr.length-1); i >=0 ; i--) {
			reverse = reverse + arr[i];
		}
		if(str.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {System.out.println("Not Palindrome");
	}
	}
}
