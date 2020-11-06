package If_Practice;

import java.util.Scanner;

public class Comparison {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		
		String comp;
		
		if(a>b) comp=">";
		else if(a<b) comp="<";
		else comp="==";
		
		System.out.print(comp);
	}
}
