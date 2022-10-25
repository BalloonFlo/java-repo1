package oday04;

import java.util.concurrent.RecursiveAction;

//재귀호출 - 함수가 자기자신을 호출한다.
//규칙    - 계속해서 호출을 할 수 있지만 언젠가는 끝나야 한다.
//       - 단점: 속도는 느리고 메모리를 많이 사용한다.
//       - 스택 공간 저장.
//5! = 5 * 4 * 3 * 2 * 1
public class 재귀호출 {

	public static void main(String[] args) {
		Recursive rs = new Recursive();
		rs.display(10);
		System.out.println();
		rs.display2(10);
		System.out.println();
		System.out.println(rs.factorial(5));
		System.out.println("-- 유클리드 호제법 - 최대 공약수 --");
		//1. 큰 수에서 작은 수를 나눈다.
		//2. 나머지가 0이면 나누는 수가 최대 공약수이다.
		//3. 나머지가 0이 아니면 작은 수 / 나머지
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