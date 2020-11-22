package Olympiad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stick {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		int n = Integer.parseInt(br.readLine());
		int[] stick = makeStick(n);
		int firstStick = stick[stick.length-1];
		int count = 1;
		
		for(int i=stick.length-2; i>=0; i--) {
			if(firstStick < stick[i]) {
				count++;
				firstStick = stick[i];
			}
		}
		System.out.println(count);
	}
	
	private static int[] makeStick(int n) throws IOException {
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		return arr;
	}
}
