package For_Practice;

import java.util.Scanner;

public class AplusB_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int a=0, b=0;
		
		for(int i=1; i<=t; i++) {
			a = input.nextInt();
			b = input.nextInt();
			
			System.out.print("Case #" + i + ": " + a + " + " + b + " = ");
			System.out.println(a+b);
		}
		input.close();
	}
}
