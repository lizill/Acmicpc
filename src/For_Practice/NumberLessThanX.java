package For_Practice;

import java.util.Scanner;

public class NumberLessThanX {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x = input.nextInt();
		
		int[] array = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = input.nextInt();
			if(array[i]<x) System.out.print(array[i] + " ");
		}
		input.close();
	}
}