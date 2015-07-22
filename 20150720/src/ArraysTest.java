import java.util.Arrays;


public class ArraysTest {
	
	public static void main(String[] args) {
		
		char[] arr1 = {'J', 'a', 'v', 'a'};
		System.out.println("arr1 = " + arr1);
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr2 = " + arr2);
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println("arr3 = " + arr3);
		System.out.println(Arrays.toString(arr3));
		
		char[] arr4 = new char[arr1.length];
//		for (int i = 0; i < arr4.length; i++) {
//			arr4[i] = arr1[i];
//		}
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println("arr4 = " + arr4);
		System.out.println(Arrays.toString(arr4));
		/*
		*/
	}
	
}






















