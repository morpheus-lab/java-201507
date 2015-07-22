package systemapi;

class A implements Cloneable {
	int i = 1;
	int[] arr = {1,2,3};
	A(int i) {set(i);}
	public void set(int i) {
		this.i = i;
		this.arr[0] = i;
	}
	public void print() {
		System.out.println("i=" + i + ", arr[0]=" + arr[0]);
	}
	public A clone() throws CloneNotSupportedException {
		A clone = (A) super.clone();
		clone.arr = this.arr.clone();	// 자신의 arr을 clone해서
										// clone 객체의 arr에 할당
		return clone;
	}
}

public class CloneTest {
	public static void main(String[] args) throws Exception {
		A a = new A(10);
		A aCopy = a.clone();
		a.set(20);
		a.print();
		aCopy.print();
	}
}
