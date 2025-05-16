package datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		
		int sum = 0;
		int avg = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
//		HashSet<Integer> set = new HashSet<Integer>();
        list.add(99);
        list.add(100);
        list.add(88);
        list.add(95);
        list.add(45);
        HashSet<Integer> set = new HashSet<>(list);
        
//        for(int i : list) {
//        	set.add(i);
//        }
        
        for(int i : set) {
			if(i%2 ==0) {
				System.out.println(i + " ---- (짝수)");
			} else {
				System.out.println(i + " ---- (홀수)");
			}
			sum += i;
		}
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/set.size());
		
        
        
        
		
		
		
	}
	
	
	

}
