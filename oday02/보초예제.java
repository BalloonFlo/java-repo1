package oday02;

import java.util.Scanner;
//page104 실습 3-3
public class 보초예제 {

	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); //자동 import 단축키 ctrl + shift + o
		
		System.out.println("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; //1. 보조알고리즘은 제일 마지막에 키 값을 넣어주어야 하니까, 1열 더 크게
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = 보초메소드(x, num, ky);
		if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
		else System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		
	}

	private static int 보초메소드(int[] a, int n, int key) {
		
		int i = 0;
		a[n] = key; //2. 찾을 값을 마지막 열에 넣어 준다.
		while (true) {
			if (a[i] == key) {
				break;
			}
			i++;
		}
		return i == n ? -1 : i;
	}

}
