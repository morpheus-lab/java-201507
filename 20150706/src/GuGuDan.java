
public class GuGuDan {

	public static void main(String[] args) {

		for (int leftDan = 2; leftDan < 10; leftDan += 2) {
			for (int i = 1; i <= 9; i++) {
				System.out.print(leftDan + " * " + i + " = " + (leftDan * i));
				System.out.print("\t");
				System.out.println((leftDan + 1) + " * " + i + " = " + ((leftDan + 1) * i));
			}
			System.out.print("\n");
		}

	}

}
