package datastructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest1 {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("자바1");
		set.add("자바2");
		set.add("자바3");
		set.add("자바4");
		
		display(set);
		
		
		HashSet<String> set2 = new HashSet<String>(set);
		
		set2.add("파이썬1");
		set2.add("파이썬2");
		set2.add("파이썬3");
		set2.add("파이썬4");
		
		display(set2);
		
		
		
	}
	
	
	public static void display(Set<String> set) {
		
		System.out.println("===============================");;
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("사이즈 => " + set.size());
	}

}
