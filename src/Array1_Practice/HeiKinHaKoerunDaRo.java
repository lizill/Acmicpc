package Array1_Practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HeiKinHaKoerunDaRo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat form = new DecimalFormat("#.000");
		double c = input.nextInt(); // 케이스
		double[] n = new double[(int)c]; // 케이스의 첫번째 수 배열
		double count =0;
		double[] winer = new double[(int)c]; // i번째 평균 이상인 학생
		
		for(int i=0; i<c; i++) {
			n[i] = input.nextInt();
			double[] total = new double[(int)c]; // i번째 성적 합
			double[] heikin = new double[(int)c]; // i번째 성적 평균
			
			while(true) {
				count = 0; // 평균보다 높은 학생수
				double[] grade = new double[(int)n[i]]; // 학생 점수
				
				for(int j=0; j<n[i]; j++) { // 케이스 별 배열
					grade[j] = input.nextInt();
					total[i] += grade[j];
				}
				
				heikin[i] = total[i]/n[i]; // i번째 성적 평균
				
				for(int j=0; j<n[i]; j++) { // 평균과 비교
					if(heikin[i]<grade[j]) count++;
				}
				
				break;
			}
			winer[i] = count/n[i];
			System.out.print(form.format(Math.round(winer[i]*100000)/1000.0));
			System.out.println("%");
		}
		input.close();
	}
}
