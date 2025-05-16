package algorism.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Baek_10950_BufferedReader {
	public static
	void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < T; i++) {
			String[] split = br.readLine().split(" ");
			int num1 = Integer.parseInt(split[0]);
			int num2 = Integer.parseInt(split[1]);
	        System.out.println(num1 + num2);
	    }
		
		
		
	}

}
