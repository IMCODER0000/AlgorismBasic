package algorism.basic;

import java.util.Scanner;

public class SearchNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numArr = {20,40,60,70,90};
		int searchNum = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i<numArr.length; i++) {
			
			if(searchNum == numArr[i]) {
				count++;
			}
			
		}
		
		if(count == 0) {
			System.out.println("찾지 못했습니다");
		} else {
			System.out.println(count +  "회 찾기 성공!!");
		}
		
		
		
	}

}
