package oday02;

import java.util.Scanner;

public class SeqSearchEx01 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); 
		
		System.out.println("��ڼ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; 
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		int idx = ���ʸ޼ҵ�(x, num, ky);
		if(idx == -1) System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		
	}

	private static int ���ʸ޼ҵ�(int[] a, int n, int key) {
		
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
