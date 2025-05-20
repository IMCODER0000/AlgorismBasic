package algorism.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek_2018_TwoPointer2 {
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] nArr = new int[N+1];
		int start = 1;
		int end = 1;
		int sum = 1;
		int count = 0;
		
		
		// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		
		while(end<=N) {
			if(sum == N) {
				count++;
				end++;
				sum+=end;
			} else if(sum<N) {
				end++;
				sum+=end;
			} else {
				sum -= start;
				start++;
			}
		}
		
		System.out.println(count);
		
		
		
		
		
	}
	

}
