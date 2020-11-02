package Number;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		int number,remainder=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no :");
		number = sc.nextInt();  
		while(number!=0) {
			remainder = number%10;
			sum =  sum*10 + remainder; 
			number = number/10;
		}
		System.out.println("Reverse is "+sum);

	}

}
