package oday06;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class �����غ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("���� �Է�> ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("�˻��� ������? ");
		int num2 = sc.nextInt();
		
		boolean flag = false;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == num2) {
				flag = true;
				System.out.println(num2 + "�� �ڷ�� ����Ʈ�� �ֽ��ϴ�.");
				break;
			}
		}
		if(!flag) {
			System.out.println(num2 + "�� �ڷ�� ����Ʈ�� �����ϴ�.");
		}
		
		
	}

}
