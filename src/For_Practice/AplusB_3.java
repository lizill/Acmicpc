package For_Practice;

import java.util.Scanner;

public class AplusB_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int a, b;
		
		for(int i=0; i<t; i++) {
			a = input.nextInt();
			b = input.nextInt();
			System.out.println(a+b);
		}
		input.close();
	}
}
