package algorism.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Baek_10951_BufferedReader {
	public static
	void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;

        while ((line = br.readLine()) != null) {
			String[] split = line.split(" ");
			int num1 = Integer.parseInt(split[0]);
			int num2 = Integer.parseInt(split[1]);
	        System.out.println(num1 + num2);
	    }
		
		
		
	}

}
