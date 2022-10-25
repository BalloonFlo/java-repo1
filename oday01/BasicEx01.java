package oday01;

import java.util.Scanner;

public class BasicEx01 { //page13, 21

	public static void main(String[] args) {
		
		int max = -999999;
		int mini = 999999;
		int mid;
		
		System.out.println("세 정수의 최대값을 구합니다");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 값");
		int a = sc.nextInt();
		System.out.println("b의 값");
		int b = sc.nextInt();
		System.out.println("c의 값");
		int c = sc.nextInt();
		
		if(max < a) max = a;
		if(max < b) max = b;
		if(max < c) max = c;

		if(mini > a) mini = a;
		if(mini > b) mini = b;
		if(mini > c) mini = c;
		
		System.out.println("최대값은 " + max + "입니다");
		System.out.println("최소값은 " + mini + "입니다");
		
		if(a >= b)
			if(b >= c)
				mid = b;
			else if(a <= c)
				mid = a;
			else
				mid = c;
		else if(a > c)
			mid = a;
		else if(b > c)
			mid = c;
		else
			mid = b;
		System.out.println("중앙값은 " + mid + "입니다");
				
	}	

}
