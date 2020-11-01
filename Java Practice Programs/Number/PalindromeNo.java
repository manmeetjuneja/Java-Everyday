package Number;

import java.util.Scanner;

public class PalindromeNo {
	public static void main(String[] args) {
		int number,sum=0,answer=0;   //151
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int original = sc.nextInt();
		number = original;
		while(number!=0) {
			sum = number%10;
			answer = answer*10 + sum; 
			number /= 10;
		}
		if (original == answer) {
			System.out.println("Palindrome hai!");
		}
		else {
			System.out.println("nahi hai!!");
		}
	}
	
}
	