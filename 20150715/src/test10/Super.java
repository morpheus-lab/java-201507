package test10;

public class Super {
	
	public float getNum() { return 3.0f; }
	
	public class Sub extends Super {
		/* �� ���� ��ġ�� ��� ������ �߻��ϴ� ��? */
		public void getNum(double d) { }	// �����ε�
		public float getNum() { return 4.0f; }	// �������̵�
//		public void getNum() { }
		public double getNum(float d) { return 4.0; }	// �����ε�
	}
}
