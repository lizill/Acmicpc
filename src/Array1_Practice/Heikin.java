package Array1_Practice;

import java.util.Scanner;

public class Heikin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double[] grade = new double[n];
		double max;
		double total = 0;
		
		for(int i=0; i<n; i++) {
			grade[i] = input.nextInt();
		}
		
		max = grade[0];
		for(int i=1; i<n; i++) {
			if(max<grade[i]) {
				max = grade[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			grade[i] = grade[i]/max*100;
			total += grade[i];
		}
		System.out.println(total/n);
		
		input.close();
	}
}
