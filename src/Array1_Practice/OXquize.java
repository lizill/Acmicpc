package Array1_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXquize {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int score = 0;
		int count = 1;
		String[] oxStr = new String[n];
		
		for(int i=0; i<n; i++) {
			oxStr[i] = bf.readLine();
		}
		
		for(int i=0; i<oxStr.length; i++) {
			for(int j=0; j<oxStr[i].length(); j++) {
				if(oxStr[i].charAt(j)=='O') {
					score += count;
					count++;
				} else {
					count = 1;
				}
			}
			System.out.println(score);
			score = 0;
			count = 1;
		}
	}
}
