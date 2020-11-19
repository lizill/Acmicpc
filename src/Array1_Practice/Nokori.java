package Array1_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Nokori {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 10;
		int m = 42;
		int[] number = new int[n];
		int[] nokori = new int[n];
		int answer = 0;
		
		for(int i=0; i<n; i++) {
			number[i] = input.nextInt();
			nokori[i] = number[i]%m;
		}
		int[] nokori2 = Arrays.copyOf(nokori, nokori.length);
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(nokori[i] == nokori2[j]) {
					nokori[i] = -1;
					continue;
				}
			}
			if(nokori[i]!=-1) answer++;
		}
		
		System.out.println(answer);
		
		input.close();
	}

}
