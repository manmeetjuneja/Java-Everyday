import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Flow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int testcases;
		double number;
		Scanner sc = new Scanner(System.in);
		testcases = sc.nextInt();
		while(testcases--!=0){
		    number = sc.nextInt();
		    if(number<0){
		        number = number -(number);
		    }
		    if(number<10) System.out.println("Thanks for helping Chef!");
		    else System.out.println("-1"); 
		}
	}
}
