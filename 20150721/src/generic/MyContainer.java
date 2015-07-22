package generic;

public class MyContainer<T> {
	
	T el;
	
	public void add(T e) {
		System.out.println(e.getClass().getName()
				+ " 타입의 데이터가 추가되었습니다.");
	}
	
	public T get() {
		return null;
	}
	
	public static void main(String[] args) {
		MyContainer<String> mc = new MyContainer<>();
		mc.add("가나다라");
		mc.get();
		
		MyContainer<Integer> mc2 = new MyContainer<>();
		mc2.add(11);
		mc2.get();
	}
	
}
