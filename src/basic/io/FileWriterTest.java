package basic.io;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 파일 출력하기
 */
public class FileWriterTest {

    public static void main(String[] args) {
    
        FileWriter fw = null;
        
        try {
            //파일 오픈
            //존재하지 않는 파일은 생성해서 작업해줌
            fw = new FileWriter("src/datafile/output3.txt");
            
            //파일 엑세스(newline 미포함)
            //출력 스트림 내부에 데이터 쌓아놓기
            
            
        } catch (IOException e) {
            System.out.println("출력 오류");
        } finally {
            
            try{
                if(fw != null) {
                    fw.close();
                }
                
            } catch (IOException e) {
                System.out.println("출력 오류");
            }
        }
    }
}