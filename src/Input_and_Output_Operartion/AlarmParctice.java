package Input_and_Output_Operartion;
import java.util.Scanner;

public class AlarmParctice {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.close();
		
		int h, m, minute = 0, alarm = 0;
		
		h = input.nextInt();
		m = input.nextInt();
		
		minute = h*60 + m;
		alarm = minute - 45;
		
		if(alarm < 0) alarm += 1440;
		
		System.out.println(alarm/60 + " " + alarm%60);
	}
}