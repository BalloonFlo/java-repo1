package oday02;

import java.util.Scanner;

//page100 �ǽ� 3-1
public class SeqSearch {

	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in); //�ڵ� import ����Ű ctrl + shift + o
		
		System.out.println("��ڼ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("�˻��� ��: ");
		int ky = stdIn.nextInt();
		
		int idx = SeqSearch(x, num, ky);
		
		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
		}
		
		
	}

	private static int SeqSearch(int[] a, int n, int key) {
		
		int i = 0; //�迭�� �ε��� ���� ��Ű�� ����
		while (true) {
			if (i == n) {
				return - 1; //�� �迭�� �� ó��
			}
			if (a[i] == key) {
				return i;
			}
			i++;
		}
	}

}
