package algorism.basic;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_1940 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String[] nArrInput = br.readLine().split(" ");
        int[] nArr = new int[N];
        for(int i = 0; i<N; i++) {
        	nArr[i] = Integer.parseInt(nArrInput[i]);
        }
        Arrays.sort(nArr);
        int start = 0, end = N-1;
        int sum = 0, count = 0;
        
        while(start<end) {
        	sum = nArr[start]+nArr[end];
        	
        	if(sum == M) {
        		start++;
        		end--;
        		count++;
        	} else if(sum < M) {
        		start++;
        	} else {
        		end--;
        	}
        }
       

        
      

        System.out.println(count);
    }
}
