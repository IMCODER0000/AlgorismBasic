package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExam3 {
	
	public static void main(String[] args) {
		Random r = new Random();
//		List<Integer> ar = new ArrayList<>();
		ArrayList<Integer> ar = new ArrayList<>();
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i<5; i++) {
			ar.add(r.nextInt(100));
		}
		for(int i : ar) {
			if(i%2 ==0) {
				System.out.println(i + " ---- (짝수)");
			} else {
				System.out.println(i + " ---- (홀수)");
			}
			sum += i;
		}
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/ar.size());
		
	}
	
	
	
	

}
