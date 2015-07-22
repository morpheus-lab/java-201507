package exception;

public class X {
	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("B");
			ex.printStackTrace();
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}

	public static void badMethod() {
		// �Ʒ� Error�� RuntimeException�� �����Ϸ��� üũ���� �ʴ�
		// Unchecked Exception�Դϴ�.
		// �׷��� throws ���� ��� ������ ������ �߻����� ����
		
//		throw new Error();
		throw new RuntimeException();
	}
}
