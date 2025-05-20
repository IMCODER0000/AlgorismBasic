package datastructure;

import java.util.Stack;

public class StackExam {
	
	public static void main(String[] args) {
		
		
		int[] myarr = {10,20,30,40};
		
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i<myarr.length; i++) {
			stack.push(myarr[i]);
		}
		
		for(int i = 0; i<myarr.length; i++) {
			System.out.println(stack.pop());
		}
		
	}

}
