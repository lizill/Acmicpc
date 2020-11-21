package For_Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAplusB {
		public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int t = Integer.parseInt(br.readLine());
			int a, b;
			
			for(int i=0; i<t; i++) {
		        String s = br.readLine();
				StringTokenizer st = new StringTokenizer(s);
		        a = Integer.parseInt(st.nextToken());
		        b = Integer.parseInt(st.nextToken());
//		        String[] ary = s.split(" ");
//		        for(String k : ary) {
//		        	System.out.println(k);
//		        }
		        bw.write(String.valueOf(a+b) + "\n");
			}
			br.close();
	        bw.flush();
	        bw.close();
	}
}