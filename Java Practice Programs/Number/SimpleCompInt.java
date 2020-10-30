package Number;

import java.util.Scanner;

public class SimpleCompInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal=0,rate=0,time=0;
		Scanner sc = new Scanner(System.in);
		principal = sc.nextDouble();
		rate = sc.nextDouble();
		time = sc.nextDouble();
		double simple_interest = (principal*rate*time)/100.0;
		double amount = principal*Math.pow(1.0+(rate/100.0),time);
		double compound_interest = amount - principal;
		System.out.println("Simple interest is"+simple_interest); 
		System.out.println("Compound interest is"+compound_interest);
	}

}
