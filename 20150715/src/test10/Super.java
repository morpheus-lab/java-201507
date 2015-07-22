package test10;

public class Super {
	
	public float getNum() { return 3.0f; }
	
	public class Sub extends Super {
		/* 이 곳에 위치할 경우 에러가 발생하는 것? */
		public void getNum(double d) { }	// 오버로딩
		public float getNum() { return 4.0f; }	// 오버라이딩
//		public void getNum() { }
		public double getNum(float d) { return 4.0; }	// 오버로딩
	}
}
