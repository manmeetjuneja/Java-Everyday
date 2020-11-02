package String;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str,reverse ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		str = sc.nextLine();
		int length = str.length();
		for(int i=length-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
//		System.out.println(reverse);
		if(str.equals(reverse)) {
			System.out.println("Palandrome hai");
		}
		else {
			System.out.println("Nahi hai");
		}
	}
	

}
