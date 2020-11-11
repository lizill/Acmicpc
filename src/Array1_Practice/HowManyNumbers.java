package Array1_Practice;

import java.util.Scanner;

public class HowManyNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int multi = a*b*c;
		String s = Integer.toString(multi);
		int arrayLength = s.length();
//		System.out.println(arrayLength);
		
		int[] numbers = new int[10];
		
		for(int i=0; i<10; i++) {
			numbers[i] = 0;
		}
		
		for(int i=0; i<arrayLength; i++) {
			if(s.charAt(i)=='0') numbers[0]++;
			else if(s.charAt(i)=='1') numbers[1]++;
			else if(s.charAt(i)=='2') numbers[2]++;
			else if(s.charAt(i)=='3') numbers[3]++;
			else if(s.charAt(i)=='4') numbers[4]++;
			else if(s.charAt(i)=='5') numbers[5]++;
			else if(s.charAt(i)=='6') numbers[6]++;
			else if(s.charAt(i)=='7') numbers[7]++;
			else if(s.charAt(i)=='8') numbers[8]++;
			else numbers[9]++;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(numbers[i]);
		}
		input.close();
	}

}
