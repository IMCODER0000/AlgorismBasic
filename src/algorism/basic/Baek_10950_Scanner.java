package algorism.basic;

import java.util.Scanner;

//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//
//    int T = sc.nextInt();  
//
//    for (int i = 0; i < T; i++) {
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        System.out.println(A + B);
//    }
//
//    sc.close();
//}

public class Baek_10950_Scanner {
	public static
	void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] num = new int[T];
		
		
		for(int i = 0; i<T; i++) {
			
		    int num1 =  sc.nextInt();
		    int num2 =  sc.nextInt();
	

		    num[i] = num1 + num2;
		    
		}
		
		for(int i = 0; i<T; i++) {
			System.out.println(num[i]);
		}
	
		
		
		
		
		
	}

}
