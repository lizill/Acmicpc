package Array1_Practice;

import java.util.Scanner;

public class OXquize {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int score = 0;
		int count = 1;
		boolean ox = false;
		
		String[] oxStr = new String[n];
		
		for(int i=0; i<n; i++) {
			oxStr[i] = input.nextLine();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<oxStr[i].length(); j++) {
				if(ox) {
					count++;
				}
				if(oxStr[i].charAt(j)=='O') {
					score += count;
					ox = true;
					count++;
				} else {
					count = 1;
				}
			}
			System.out.println(score);
			score = 0;
			count = 1;
		}
		
		input.close();
	}
}
