package oday02;

import java.util.Scanner;

public class SeqSearchEx01 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); 
		
		System.out.println("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; 
		
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
		a[n] = key; 
		for (int j = 0; j < a.length; j++) {
			a[j] = a[n];
			j++;
		}
//		while (true) {
//			if (a[i] == key) {
//				break;
//			}
//			i++;
//		}
		return i == n ? -1 : i;
	}

}
