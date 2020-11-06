package While_Practice;

import java.util.Scanner;

public class AplusB_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		while(input.hasNextInt()) { // EOF(End of File)
			a = input.nextInt();
			b = input.nextInt();
			System.out.println(a+b);
		}
		input.close();
	}
}
