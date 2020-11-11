package Array1_Practice;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int min, max;
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = input.nextInt();
		}
		
		min = a[0];
		max = a[0];
		
		for(int i=0; i<n; i++) {
			if(min>a[i]) {
				min = a[i];
			}
			if(max<a[i]) {
				max = a[i];
			}
		}
		System.out.print(min + " " + max);
		input.close();
	}

}
