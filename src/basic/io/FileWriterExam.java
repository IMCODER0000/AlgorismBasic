package basic.io;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterExam {
    public static void main(String[] args) {
        FileWriter fw = null;
        
        try {
        
            fw = new FileWriter("src/datafile/.txt");

    
            for(int i = 1; i <10; i++) {
                for(int j = 1; j<10; j++) {
                    fw.write(i + "*" + j +" = " + i*j + "   ");
                }
                fw.write("\n");
            }
       

        
        }catch(IOException e) {
            System.out.println("출력오류~~~~");
        }finally {

            
            try {
                if(fw!=null) fw.close();
            } catch(IOException e) {
                
            }
        }
    }
}