package For_Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FastAplusB {
		public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int t = Integer.parseInt(br.readLine());
			int a, b;
			
			for(int i=0; i<t; i++) {
				a = Integer.parseInt(br.readLine());
				b = Integer.parseInt(br.readLine());
				bw.write(a+b + "\n");
			}
			
			bw.flush();
			bw.close();
	}
}