package Array1_Practice;

import java.util.Scanner;

public class Heikin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] grade = new int[n];
		
		for(int i=0; i<n; i++) {
			grade[i] = input.nextInt();
		}
		
		input.close();
	}
}
