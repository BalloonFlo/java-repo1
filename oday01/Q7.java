package oday01;

import java.util.Scanner;

public class Q7 { //page31

	public static void main(String[] args) { //page31
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 정수 합을 구합니다.");
		
		System.out.println("n값");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1~" + n + "까지의 합은 " + sum + "입니다");
		
		double sum2 = 0;
		sum2 = (1 + n) * (n/2.0);
		
		System.out.println("1~" + n + "까지의 합은 " + (int)sum2 + "입니다");
		
	}

}
