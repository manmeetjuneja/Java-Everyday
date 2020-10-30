package Sorting;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Sorting in bubble sort.
		int a[] = {1,2,3,4,7,5,6,2,8,6,5,9,4};
		for(int i = 0;i<(a.length -1);i++) {
			for(int j=0;j<(a.length-1);j++) {
				if(a[j+1] <= a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
			
		}
		for(int item:a) {
			System.out.print(item +" ");
		}
		
	}

}
