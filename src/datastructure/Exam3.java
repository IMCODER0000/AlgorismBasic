package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exam3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br1 = new BufferedReader(new FileReader("src/datafile/src1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("src/datafile/src2.txt"));

        String line1 = "";
		String line2 = "";
		String data1 ="";
		String data2 ="";
		while((data1 = br1.readLine()) != null) {
			line1 += data1;
		}
		while((data2 = br2.readLine()) != null) {

			line2 += data2;
			
		}

        System.out.println("line1 : ");
		System.out.println(line1);
        System.out.println("line2 : ");
		System.out.println(line2);

       ArrayList<String> result = compareFile(line1,line2);
       
       System.out.println();
       System.out.println("=============== 결 과 =================");
       for(String s : result) {
    	   System.out.println(s);
       }
       System.out.println("=======================================");

        br1.close();
        br2.close();
    }
    
	public static ArrayList<String> compareFile(String file1, String file2){
		
		ArrayList<String> resultArray = new ArrayList<>();
	
		 int minLength = Math.min(file1.length(), file2.length());
	        String temp = "";

	        for (int i = 0; i < minLength; i++) {
	            char c1 = file1.charAt(i);
	            char c2 = file2.charAt(i);

	            if (c1 == c2) {
	                temp+=c1;
	            } else {
	                if (temp.length() > 0) {
	                    resultArray.add(temp);
	                    temp = "";
	                }
	            }
	        }

	        if (temp.length() > 0) {
	            resultArray.add(temp);
	        }
	        
	        return resultArray;
		
		
	}	
    
    
    
    
}
