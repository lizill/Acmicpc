package Input_and_Output_Operartion;
import java.util.*;

public class QuadrantParctice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.close();
		
		int x, y;
		int quad = 4;
		
		do {
			x = input.nextInt();
		} while(!(-1000 <= x && x <= 1000) || x==0);
		
		do {
			y = input.nextInt();
		} while(!(-1000 <= x && x <= 1000) || x==0);
		
		if(x > 0 && y > 0) quad = 1;
		else if(x < 0 && y > 0) quad = 2;
		else if(x < 0 && y < 0) quad = 3;
		
		System.out.println(quad);
	}
}