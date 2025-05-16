package basic.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy_BufferedReader {	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("src/basic/io/FileReaderTest.java"));
		FileWriter fw =  new FileWriter("src/datafile/ouput4.txt");
		
		String data = "";
		int count = 0;
		long startTime = System.nanoTime();
		while((data = br.readLine())!= null) {
			fw.write(data + "\n");
			System.out.println(data);
			System.out.println();
			
			count++;
		}
		
		long endTime = System.nanoTime();
		System.out.println("실행 횟수 = > " + count);
		System.out.println("실행 횟수 = > " + (endTime - startTime));
		br.close();
		fw.close();
		
		
	}

}
