package Input_and_Output_Operartion;
import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		
		int first, second, third;
		first = b-((b/10)*10);
		second = (b-first-((b/100)*100))/10;
		third = b/100;
		
		System.out.println(a*first);
		System.out.println(a*second);
		System.out.println(a*third);
		System.out.println(a*b);
	}
}
