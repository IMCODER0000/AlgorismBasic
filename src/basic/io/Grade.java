package basic.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Grade {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("src/datafile/score.txt"));
	
		String data = "";
		int count = 0;
		int total = 0;
		int totalAvg = 0; 
//		while(count<4) {
		while((data = br.readLine())!= null) {
			String[] Person = data.split(",");
			
			System.out.println(Person[0] + "의 점수는 " + Person[1] + "점 입니다.");
			
			total+= Integer.parseInt(Person[1]);
			
			
		}
		
		totalAvg = total/count;
		
		System.out.println("모두의 총점은 " + total + "점 입니다.");
		System.out.println("모두의 평균은 " + totalAvg + "점 입니다.");
		
	}
	
	
	

}
