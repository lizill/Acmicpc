package Input_and_Output_Operartion;
import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		input.close();
		
		System.out.println((a+b)%c);
		System.out.println(((a+c)+(b+c))%c);
		System.out.println((a*b)%c);
		System.out.print(((a%c)*(b%c))%c);
	}
}
