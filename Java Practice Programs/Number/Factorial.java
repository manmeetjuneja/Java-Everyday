package Number;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int number,flag=0,factorial=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no :");
		number = sc.nextInt();
		if(number==0) {
			factorial=1;
		}
		else {
			for(int i = number;i>1;i--) {
				factorial = factorial *i;
			}
		}
		System.out.println("Factorial is "+factorial);
	}
	}

