package algorism.basic;



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek_2013 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[] nArr = new int[N];
        String[] nArrInput = br.readLine().split(" ");
        int start = 0, end = 0;
        int count = 0;
        int sum = 0;
        
        for(int i = 0; i<N; i++) {
        	nArr[i] = Integer.parseInt(nArrInput[i]);
        }
        
        while(true) {
        	if(sum>= M) {
        		sum -= nArr[start++];
        	} else if(end == N) {
        		break;
        	} else {
        		sum += nArr[end++];
        	}
        	
        	if(sum == M) {
        		count++;
        	}
        }
        
        
        
        
        

        
        
        
      

        System.out.println(count);
    }
}
