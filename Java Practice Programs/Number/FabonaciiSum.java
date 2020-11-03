package Number;

import java.util.Scanner;

public class FabonaciiSum {

	public static void main(String[] args) {
		System.out.println("Fabo with array sum");
		int arr[] = {1,2,3,4};
//		String s;
		int n,sum=0;
		Scanner sc = new Scanner(System.in);
//		s = sc.nextLine();
//		n = sc.nextInt();
		for(int i=0;i<=(arr.length-1);i++){
		    sum = sum + arr[i];
		}
		int f=0,k=1,l;
        System.out.print(f+" "+k+" ");
		for(int j=1;j<=sum;j++)
		{  
		   l = f+k;
		   System.out.print(l+" ");
		   f = k;
		   k = l;
		}
// 		System.out.println(s);
// 		System.out.println(n);

	}

}