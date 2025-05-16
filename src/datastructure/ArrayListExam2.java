package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExam2 {
	
	static ArrayList<String> changeArrayList(String[] arr){
		ArrayList<String> arryList = new ArrayList<>();
		
		
		for(int i = 0; i< arr.length; i++) {
			arryList.add(arr[i]);
		}
		
		return arryList;
		
		
	}
	
	public static void main(String[] args) {
		
		String[] strArr = {"java","servlet","jsp","spring"};
		
		ArrayList<String> changeArrayList = changeArrayList(strArr);
		
		for(String s : changeArrayList) {
			System.out.println(s);
		}
		

		
		
	}
	
	
	
	

}
