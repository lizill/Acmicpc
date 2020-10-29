package For_Practice;

import java.util.Scanner;

public class NPress {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(n-i);
		}
		input.close();
	}
}
