package For_Practice;

import java.util.Random;
import java.util.Scanner;

public class NumberLessThanX {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // ���� N
		int x = input.nextInt(); // ���� X��
//		int trm = 0;
		
		Random rand = new Random();
		int[] a = new int[n]; // ����
		
		for (int i=0; i<n; i++) {
			a[i] = (rand.nextInt(n)+1);
			for(int j=0; j<i; j++) {
				if(a[i] == a[j]) {
					i = i-1;
//					trm = 1;
					break;
				} 
//				else {
//					trm = 0;
//				}
			}
//			if(trm==0) {
//				System.out.print(a[i] + " ");
//			}
		} // 1~n�� �ߺ������ʴ� ������ ���� 
		
//		System.out.println();
		for(int i=0; i<n; i++) {
			if(a[i]<x) System.out.print(a[i] + " ");
		}
		input.close();
	}
}
