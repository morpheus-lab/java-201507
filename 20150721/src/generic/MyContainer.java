package generic;

public class MyContainer<T> {
	
	T el;
	
	public void add(T e) {
		System.out.println(e.getClass().getName()
				+ " Ÿ���� �����Ͱ� �߰��Ǿ����ϴ�.");
	}
	
	public T get() {
		return null;
	}
	
	public static void main(String[] args) {
		MyContainer<String> mc = new MyContainer<>();
		mc.add("�����ٶ�");
		mc.get();
		
		MyContainer<Integer> mc2 = new MyContainer<>();
		mc2.add(11);
		mc2.get();
	}
	
}
