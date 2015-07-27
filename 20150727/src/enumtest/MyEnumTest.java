package enumtest;

enum MyEnum {
	
	VALUE1,
	VALUE2,
	VALUE3;
	
	public String toStr() {
		String str = null;
		
		switch (this) {
		case VALUE1:
			str = "°ª1";
			break;
		case VALUE2:
			str = "°ª2";
			break;
		case VALUE3:
			str = "°ª3";
			break;
		}
		
		return str;
	}
	
}

public class MyEnumTest {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.VALUE1;
		MyEnum e2 = MyEnum.VALUE2;
		MyEnum e3 = MyEnum.VALUE1;
		
		System.out.println(e1 == e2);
		System.out.println(e1 == e3);
		
		System.out.println(e1.toStr());
		System.out.println(e2.toStr());
		System.out.println(e3.toStr());
	}
}
