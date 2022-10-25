package oday04;

public class 스택 {

	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		
		//삽입하기
		s.push('A');
		s.push('B');
		s.push('C');
		s.push('D');
		s.push('E');
		
		System.out.print((char) s.pop() + " "); //꺼내기
		System.out.print((char) s.pop() + " ");
		System.out.print((char) s.pop() + " ");
		System.out.print((char) s.pop() + " ");
		System.out.print((char) s.pop() + " ");

		Stack<Integer> s1 = new Stack<Integer>();
		
		//삽입하기
		s1.push(50);
		s1.push(60);
		s1.push(70);
		s1.push(80);
		s1.push(90);
		
		System.out.print((Integer) s1.pop() + " "); //꺼내기
		System.out.print((Integer) s1.pop() + " ");
		System.out.print((Integer) s1.pop() + " ");
		System.out.print((Integer) s1.pop() + " ");
		System.out.print((Integer) s1.pop() + " ");
	}

}

class Stack<T> {
	
	private T stack[];
//	private T stack[] = stack = (T[])new Object[10];
	private int top; //배열의 인덱스로 스택의 최상위를 가르켜 준다.
	
	//스택의 기본생성자로 생성하면 10개의 스택공간이 확보
	@SuppressWarnings("unchecked")
	public Stack() {
		stack = (T[]) new Object[10];
		top = -1; //스택이 비어 있는 상황.
	}
	
	//스택의 크기를 임의의 크기로 만들기. 최소 크기는 10으로 한다.
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		if (size < 10) {
			size = 10;
		}
		stack = (T[]) new Object[size];
		top = -1; //스택이 비어 있는 상황.
	}
	
	public void push(T a) {
		//스택의 공간이 꽉 차져있는지 확인하기.
		if (isFull()) {
			System.out.println("Stack OverFlower");
			return;
		}
		top++;
//		System.out.print(top + " ");
		stack[top] = a;
//		System.out.print(stack[top] + " ");
	}

	private boolean isFull() {
		if (top == stack.length - 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public T pop() {
		if (isEmpty()) {
			System.out.println("Stack UnderFlower");
			return null;
		}
		
		T temp = stack[top];
		top--;
		return temp;
	}

	private boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	
}