package Sorting;

public class Selectionsort {
	public static void main(String[] args)
	{
	
	int a [] = {1,4,8,2,7,9,3,6,5};
		for (int i = 0;  i<(a.length-1); i++) 
		{
			int minimum_index = i;
			for (int j = i; j < a.length; j++) {
				if(a[j]<a[minimum_index]) {
					minimum_index = j;
				}
			}
			int temp = a[i];
			a[i] = a[minimum_index];
			a[minimum_index] = temp;
		}
		for(int item:a) {
			System.out.print(item +" ");
		}
	}

}