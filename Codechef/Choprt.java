import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Choprt
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int testcases;
	    double num1,num2;
	    Scanner sc = new Scanner(System.in);
	    testcases = sc.nextInt();
	    while(testcases--!=0){
	       num1 = sc.nextInt(); 
	       num2 = sc.nextInt();
	       if(num1>num2) System.out.println(">");
	       if(num1<num2) System.out.println("<");
	       if(num1==num2) System.out.println("=");
	    }
	}
}