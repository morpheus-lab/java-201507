package util;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("�ѱ�");
		stack.push("�߱�");
		stack.push("�Ϻ�");
		
		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		} catch (Exception e) {
			System.out.println("���ܹ߻�!");
		}
	}
}
