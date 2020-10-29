package While_Practice;

import java.util.Scanner;

public class AplusB_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 1;
		int b = 1;
		
		while(true) {
			a = input.nextInt();
			b = input.nextInt();
			if (a == 0 && b == 0) break;
			System.out.println(a+b);
		}
		input.close();
	}
}
