package Alignment;

import java.util.Arrays;
import java.util.Scanner;

public class NumSort2 {
	public static void main(String[] args) {
		// 오름차순 정렬
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int originalArr[] = new int[n];
		for (int i=0; i<n; i++) { // 오리지널 배열 생성
			originalArr[i] = input.nextInt();
		}
		
//		System.out.println(Arrays.toString(sortUp(originalArr)));
		sortUp(originalArr);
		
		input.close();
	}
	
	public static void sortUp(int[] oriArr) {
		int tmp;
		
		for(int i=0; i<oriArr.length; i++) {
			int minIdx = i;
			for(int j=i; j<oriArr.length; j++) {
				if(oriArr[minIdx]>oriArr[j]) {
					minIdx = j;
				}
			}
			tmp = oriArr[i];
			oriArr[i] = oriArr[minIdx];
			oriArr[minIdx] = tmp;
			System.out.println(oriArr[i]);
		}
	}
}
