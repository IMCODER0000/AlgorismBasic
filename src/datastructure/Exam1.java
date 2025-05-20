package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Exam1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("oracle");
        list.add("servlet");
        list.add("jsp");
        list.add("spring");
        
        HashMap<String, String> map = new HashMap<>();
        
        int index = 0;
        for(String s : list) {
        	map.put("mymap"+index, s);
        	index++;
        }
        
        display(map);


        //List -> Map으로 변환
        // => map의 key : "mymap"+i
    }
    
    public static void display(HashMap<String,String> map) {
		
		System.out.println("===============================");;
		Set<String> keySet = map.keySet();
		for(String k : keySet) {
			System.out.println( k +"  "+map.get(k));
		}
	}
}