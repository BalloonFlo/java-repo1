package oday03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ��ũ����Ʈ {

	public static void main(String[] args) {

		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList = Arrays.asList(1, 2, 3, 4, 5, 6, 1);
		//���� for��
		for (int a : linkedList) {
			System.out.print(a + " ");
		}
		System.out.println();
		//Iterator �������̽� �ݺ��ڸ� �����ϴ� �������̽��� ����ϱ�
		Iterator<Integer> it = linkedList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}

}
