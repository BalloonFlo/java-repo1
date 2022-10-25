package oday04;

import java.util.concurrent.RecursiveAction;

//���ȣ�� - �Լ��� �ڱ��ڽ��� ȣ���Ѵ�.
//��Ģ    - ����ؼ� ȣ���� �� �� ������ �������� ������ �Ѵ�.
//       - ����: �ӵ��� ������ �޸𸮸� ���� ����Ѵ�.
//       - ���� ���� ����.
//5! = 5 * 4 * 3 * 2 * 1
public class ���ȣ�� {

	public static void main(String[] args) {
		Recursive rs = new Recursive();
		rs.display(10);
		System.out.println();
		rs.display2(10);
		System.out.println();
		System.out.println(rs.factorial(5));
		System.out.println("-- ��Ŭ���� ȣ���� - �ִ� ����� --");
		//1. ū ������ ���� ���� ������.
		//2. �������� 0�̸� ������ ���� �ִ� ������̴�.
		//3. �������� 0�� �ƴϸ� ���� �� / ������
		System.out.println(rs.gcd(22, 8));
	}

}

class Recursive {
	
	public void display(int limit) {
		if (limit == 0) {
			return;
		}
		
		System.out.print(limit + " ");
		display(limit - 1);
	}
	
	public void display2(int limit) {
		if (limit == 0) {
			return;
		}
		
		display2(limit - 1);
		System.out.print(limit + " ");
	}
	
	public int factorial(int limit) {
		if (limit == 1) {
			return 1;
		} else {
			return limit * factorial(limit - 1);
		}
	}
	
	public int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}
	
}