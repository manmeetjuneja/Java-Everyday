/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fsqrt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number,testcases;
		float root;
		Scanner sc = new Scanner(System.in);
		testcases = sc.nextInt();
		while(testcases--!=0){
		    number = sc.nextInt();
		    root = (float)Math.sqrt(number);
		    System.out.println((int)Math.floor(root));
		}
	}
}