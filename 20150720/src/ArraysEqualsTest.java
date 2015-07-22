import java.util.Arrays;


public class ArraysEqualsTest {
	
	public static void main(String[] args) {
		
		int[][] original = {{1, 2}, {3, 4}};
		
		// ���� ������ ��
		int[][] clone1 = Arrays.copyOf(original, original.length);
//		System.out.println("������ ��: " + original.equals(clone1));
		System.out.println("������ ��: " + (original == clone1));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, clone1));
		System.out.println("2�� �迭 �׸� ��: " + Arrays.deepEquals(original, clone1));
		
		System.out.println("-------------------------");
		
		// ���� ������ ��
		int[][] clone2 = Arrays.copyOf(original, original.length);
		clone2[0] = Arrays.copyOf(original[0], original[0].length);
		clone2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("������ ��: " + (original == clone2));
		System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(original, clone2));
		System.out.println("2�� �迭 �׸� ��: " + Arrays.deepEquals(original, clone2));
	}
	
}
