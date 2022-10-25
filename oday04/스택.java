package oday04;

public class ���� {

	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		
		//�����ϱ�
		s.push('A');
		s.push('B');
		s.push('C');
		s.push('D');
		s.push('E');
		
		System.out.print((char) s.pop() + " "); //������
		System.out.print((char) s.pop() + " ");
		System.out.print((char) s.pop() + " ");
		System.out.print((char) s.pop() + " ");
		System.out.print((char) s.pop() + " ");

		Stack<Integer> s1 = new Stack<Integer>();
		
		//�����ϱ�
		s1.push(50);
		s1.push(60);
		s1.push(70);
		s1.push(80);
		s1.push(90);
		
		System.out.print((Integer) s1.pop() + " "); //������
		System.out.print((Integer) s1.pop() + " ");
		System.out.print((Integer) s1.pop() + " ");
		System.out.print((Integer) s1.pop() + " ");
		System.out.print((Integer) s1.pop() + " ");
	}

}

class Stack<T> {
	
	private T stack[];
//	private T stack[] = stack = (T[])new Object[10];
	private int top; //�迭�� �ε����� ������ �ֻ����� ������ �ش�.
	
	//������ �⺻�����ڷ� �����ϸ� 10���� ���ð����� Ȯ��
	@SuppressWarnings("unchecked")
	public Stack() {
		stack = (T[]) new Object[10];
		top = -1; //������ ��� �ִ� ��Ȳ.
	}
	
	//������ ũ�⸦ ������ ũ��� �����. �ּ� ũ��� 10���� �Ѵ�.
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		if (size < 10) {
			size = 10;
		}
		stack = (T[]) new Object[size];
		top = -1; //������ ��� �ִ� ��Ȳ.
	}
	
	public void push(T a) {
		//������ ������ �� �����ִ��� Ȯ���ϱ�.
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