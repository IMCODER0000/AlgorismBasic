package basic.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTset {
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
//			fr = new FileReader("src/datafile/test.txt");
			br = new BufferedReader(new FileReader("src/datafile/test.txt"));
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				
				System.out.println(line);
			}
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
