package util;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("한국");
		stack.push("중국");
		stack.push("일본");
		
		try {
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		} catch (Exception e) {
			System.out.println("예외발생!");
		}
	}
}
