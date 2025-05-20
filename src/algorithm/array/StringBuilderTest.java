package algorithm.array;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		
		String str = new String("AAAA");
		System.out.println(str.concat("어렵다 ㅜㅜ"));
		System.out.println("string 원본 : " + str);
		
		StringBuilder sb = new StringBuilder("AAAA");
		sb.append("어렵다 ㅠㅠ");
		System.out.println("Stringbuilder 원본 : " + sb);
		sb.insert(1, "Q");
		System.out.println("Stringbuilder 원본 : " + sb);
		sb.reverse();
		System.out.println("Stringbuilder 원본 : " + sb);
		
		
		
	}

}
