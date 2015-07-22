
public class ArrayIndexError {

	public static void main(String[] args) {
		int[] a = {1,2};
		int i = -1;
		if (i >= 0 && i < a.length) {
			System.out.println(a[i]);
		}
//		System.out.println(a[2]);
		a = null;
		if (a != null) {
			System.out.println(a[0]);
		}
	}
	
}
