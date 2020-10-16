package Input_and_Output_Operartion;
import java.util.Scanner;

public class ADivisionB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextInt();
		double b = input.nextInt();
		input.close();
		
		System.out.print(a/b);
	}
}
