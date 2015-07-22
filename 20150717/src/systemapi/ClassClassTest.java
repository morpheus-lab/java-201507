package systemapi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class C {
	public String s1;
	public int i1;
	public void m1() {}
	public void m2() {}
}

public class ClassClassTest {
	
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("systemapi.ClassClassTest");
		Method[] methods = clazz.getMethods();
		for (Method m : methods) {
			int mod = m.getModifiers();
			switch (mod) {
			case Modifier.PUBLIC:
				System.out.print("public ");
				break;
			case Modifier.PROTECTED:
				System.out.print("protected ");
				break;
			}
			System.out.println(m.getName());
		}
		Object o = clazz.newInstance();
		System.out.println(o);
	}
	
}
