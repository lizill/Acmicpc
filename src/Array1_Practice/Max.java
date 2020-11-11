package Array1_Practice;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[9];
		
		for(int i=0; i<9; i++) {
			a[i] = input.nextInt();
		}
		
		int max = a[0];
		int count = 1;
		
		for(int i=0; i<9; i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		
		for(int i=0; i<9; i++) {
			if(max==a[i]) break;
			count++;
		}
		System.out.println(max + "\n" + count);
		input.close();
	}

}
