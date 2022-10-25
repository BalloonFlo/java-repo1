package oday02;

import java.util.Scanner;

//page100 실습 3-1
public class SeqSearch {

	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); //자동 import 단축키 ctrl + shift + o
		
		System.out.println("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("검색할 값: ");
		int ky = stdIn.nextInt();
		
		int idx = SeqSearch(x, num, ky);
		
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
		
		
	}

	private static int SeqSearch(int[] a, int n, int key) {
		
		int i = 0; //배열의 인덱스 증가 시키는 변수
		while (true) {
			if (i == n) {
				return - 1; //빈 배열인 것 처리
			}
			if (a[i] == key) {
				return i;
			}
			i++;
		}
	}

}
