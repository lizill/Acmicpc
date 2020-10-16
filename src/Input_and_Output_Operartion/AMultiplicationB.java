package Input_and_Output_Operartion;
import java.util.Scanner;

public class AMultiplicationB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		
		System.out.print(a*b);
	}
}
