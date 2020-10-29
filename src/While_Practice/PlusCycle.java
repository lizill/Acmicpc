package While_Practice;

import java.util.Scanner;

public class PlusCycle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a, b, sum=n, count=1, number;

		a=n/10;
		b=n-(n/10)*10;
		sum=a+b;
		number = b*10+(sum-(sum/10)*10);
		
		while(n != number) {
			a=number/10;
			b=number-(number/10)*10;
			sum=a+b;
			number = b*10+(sum-(sum/10)*10);
			count++;
		}
		
		System.out.println(count);
		input.close();
	}
}