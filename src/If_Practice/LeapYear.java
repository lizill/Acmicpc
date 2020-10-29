package If_Practice;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		int leap = 0;
		
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) leap=1;
		
		System.out.print(leap);
		input.close();
	}
}
