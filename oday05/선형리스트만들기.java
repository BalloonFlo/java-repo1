package oday05;

import java.util.ArrayList;
import java.util.List;

public class ��������Ʈ����� {

	public static void main(String[] args) {
		List1 arr = new List1();
		arr.createList(10); //����ִ� ����Ʈ �����
		System.out.println(arr.isEmpty(arr)); //����Ʈ �ȿ� ����ִ��� �Ǵ�
		arr.insert(arr, 0, 1);
		arr.printall(arr);
		
		arr.insert(arr, 1, 2);
		arr.printall(arr);
		
		arr.insert(arr, 2, 3);
		arr.printall(arr);
		
		arr.insert(arr, 1, 4);
		arr.printall(arr);
		
		arr.delete(arr, 4);
		
//		List ulist = new ArrayList<Integer>();
//		ulist.add(10);
//		ulist.add(20);
//		ulist.add(40);
//		ulist.add(30);
//		for (int i = 0; i < ulist.size(); i++) {
//			System.out.println(ulist.get(i));
//		}
	}

}

//����Ʈ�� �����͸� ������� ������ ����
//���� ����Ʈ�� �ִ� ���� ��ҵ�
//head node-���� ó���� �ִ� ���, tail node-���� �������� �ִ� ���
//predecessor node-�ϳ��� ��带 �������� �ٷ� �տ� ���
//successor node-�ϳ��� ��带 �������� �ٷ� �ڿ� ���

class List1 {
	
	int arr[];
	int size;
	
	public void createList(int number) {
		//�迭�� ũ�⸦ 10�� �迭 ����
		arr = new int[number];
		size = 0;
	}

	public void delete(List1 a, int x) {
		//�ش簪�� ã�Ƽ� �����ϱ�
		for (int i = 0; i < size; i++) {
			if (a.arr[i] == x) {
				while (i < size - 1) {
					a.arr[i] = a.arr[i + 1];
					size--;
				}
			}
		}
	}

	public void printall(List1 a) {
		//��ü ����ϱ�
		System.out.println();
		for (int i = 0; i < size; i++) {
			System.out.printf("%3d", a.arr[i]);
		}
	}

	public void insert(List1 a, int i, int x) {
		//����Ʈ�� �� �����ϱ�
		int len = size;
		while (i != len) {
			
		}
		a.arr[len] = x;
		size++;
	}

	public boolean isEmpty(List1 a) {
		//�迭�� ����ִ��� Ȯ���ϱ�
		return a.size == 0;
	}
	
}