package string;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Programming");
		System.out.println(sb.toString());	// String 객체 생성됨
		
		sb.append('a');
		sb.append(true);
		sb.append(1);
		System.out.println(sb.toString());
		
		sb.insert(10, "x");
		System.out.println(sb.toString());
		
		sb.delete(0, 3);	// start 인덱스 포함 ~ end 인덱스 미포함 범위
		System.out.println(sb.toString());
		
		sb.setCharAt(14, ' ');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		System.out.println(sb.length());	// 버퍼에 저장된 문자 개수
		/*
		*/
	}
	
}
