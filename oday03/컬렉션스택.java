package oday03;

import java.util.Stack;

public class �÷��ǽ��� {

	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<Integer>();
		
		stack.push(90);
		stack.push(91);
		stack.push(92);
		stack.push(90);
		
//		stack.pop();
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

}
