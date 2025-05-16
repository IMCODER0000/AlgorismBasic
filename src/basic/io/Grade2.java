package basic.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class Grade2 {
	
	public void printGrade(String fileName) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int total = 0;
        int avg = 0;
        int count = 0;
        
        while(true) {
        	 
            String line = br.readLine();
            
            if(line == null) {
                break;
            }
            
            
            String[] data = line.split(",");
            total += Integer.parseInt(data[1]);
            System.out.println(data[0] + "의 점수는 " + data[1] + "점 입니다.");
      
        }
        avg = total / count;
        System.out.println("모두의 총점은 " + total + "점 입니다.");
        System.out.println("모두의 평균은 " + avg + "점 입니다.");
        br.close();
    }

    public static void main(String[] args) throws Exception {
        Grade2 grade = new Grade2();

        String fileName = "src/datafile/score.txt";
        grade.printGrade(fileName);

        }

        
}