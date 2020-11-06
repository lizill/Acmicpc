package If_Practice;

import java.util.*;
public class Quadrant {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
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
		input.close();
	}
}
