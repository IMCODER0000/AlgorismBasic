package algorism.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baek_10828 {
	
	static List<Integer> stack;
	
	private static void push(int x) {
		stack.add(x);
	}
	
	private static void pop() {
		
		if(stack.size()==0) {
			System.out.println(-1);
		} else {
			System.out.println(stack.get(stack.size()-1));
			stack.remove((stack.size()-1));
		}
	}
	private static void size() {
		System.out.println(stack.size());
	}
	private static void empty() {
		if(!stack.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
		
	}
	private static void top() {
		if(stack.isEmpty()) {
			System.out.println(-1);
		} else {
			System.out.println(stack.get(stack.size()-1));
		}
		
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
	
		stack = new ArrayList<Integer>();
		
		for(int i = 0; i<N; i++) {
			String[] input = br.readLine().split(" ");
			if(input.length == 1) {
				switch(input[0]){
					case "pop" :
						pop();
						break;
					case "size" :
						size();
						break;
					case "empty" :
						empty();
						break;
					case "top" :
						top();
						break;
				
				}
				
				
				
			} else {
				int ii = Integer.parseInt(input[1]);
				push(ii);
				
			}
	
			
			
			
			
			
			
		}
		
		
		
		
		
	}

}
