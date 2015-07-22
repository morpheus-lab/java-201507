import java.util.Arrays;


public class ArraysEqualsTest {
	
	public static void main(String[] args) {
		
		int[][] original = {{1, 2}, {3, 4}};
		
		// 얕은 복사후 비교
		int[][] clone1 = Arrays.copyOf(original, original.length);
//		System.out.println("참조값 비교: " + original.equals(clone1));
		System.out.println("참조값 비교: " + (original == clone1));
		System.out.println("1차 배열 항목 비교: " + Arrays.equals(original, clone1));
		System.out.println("2차 배열 항목 비교: " + Arrays.deepEquals(original, clone1));
		
		System.out.println("-------------------------");
		
		// 깊은 복사후 비교
		int[][] clone2 = Arrays.copyOf(original, original.length);
		clone2[0] = Arrays.copyOf(original[0], original[0].length);
		clone2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("참조값 비교: " + (original == clone2));
		System.out.println("1차 배열 항목 비교: " + Arrays.equals(original, clone2));
		System.out.println("2차 배열 항목 비교: " + Arrays.deepEquals(original, clone2));
	}
	
}
