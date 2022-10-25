package oday06;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 시험준비 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("정수 입력> ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("검색할 정수는? ");
		int num2 = sc.nextInt();
		
		boolean flag = false;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == num2) {
				flag = true;
				System.out.println(num2 + "의 자료는 리스트에 있습니다.");
				break;
			}
		}
		if(!flag) {
			System.out.println(num2 + "의 자료는 리스트에 없습니다.");
		}
		
		
	}

}
