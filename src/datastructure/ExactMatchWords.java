package datastructure;



import java.util.*;

public class ExactMatchWords {
	public static String getCommonPrefix(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        int i = 0;
        while (i < minLength && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }
        return s1.substring(0, i);  
    }

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "HelloJava";

        String result = getCommonPrefix(str1, str2);
        System.out.println("공통 부분: " + result); 
    }
}
