package oday06;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ��ũ�帮��Ʈ {
//p.312 �ǽ� 8-2
	
	static Scanner stdIn = new Scanner(System.in);
		
	static class Data {
			
		static final int NO = 1;
		static final int NAME = 2;
			
		private Integer no;
		private String name;
			
		@Override
		public java.lang.String toString() {
			return "(" + no + ")" + name;
		}
			
		void scanData(String guide, int sw) {
				
			System.out.println(guide + "�� �����͸� �Է��ϼ���.");
			if ((sw & NO) == NO) {
				System.out.println("��ȣ: ");
				no = stdIn.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.println("�̸�: ");
				name = stdIn.next();
			}
			
		} //ã�� �Լ��� ó���ϱ� ���ؼ� ã�� ������ �ڵ�
			
		public static final Comparator<Data> NO_ORDER = new NoOrderComparator();
		
		private static class NoOrderComparator implements Comparator<Data> {
				
			public int compare(Data d1, Data d2) {
					
				return (d1.no > d2.no) ? 1 : (d1.no < d2.no) ? -1 : 0;
					
			}
				
		} // ���� �����(no��)�� ����

		public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();
			
		private static class NameOrderComparator implements Comparator<Data> {
				
			public int compare(Data d1, Data d2) {
					
				return d1.name.compareTo(d2.name);
					
			}
				
		} 
			
	} //end Data class
	
	//������ ��ü�� ������ �ִ� ��(������ ��)�� ó���� �� �ַ� ����մϴ�. 
	enum Menu {
		
		ADD_FIRST(  "�Ӹ��� ��带 ����"),
		ADD_LAST(   "������ ��带 ����"),
		RMV_FIRST(  "�Ӹ� ��带 ����"),
		RMV_Last(   "���� ��带 ����"),
		RMV_CRNT(   "���� ��带 ����"),
		CLEAR(      "��� ��带 ����"),
		SEARCH_No(  "��ȣ�� �˻�"),
		SEARCH_Name("�̸����� �˻�"),
		NEXT(       "���� ��带 �ϳ� �������� ����"),
		PRINT_CRNT( "���� ��带 ���"),
		DUMP(       "��� ��带 ���"),
		TERMINATE(  "����");
		
		private final String message;
		
		static Menu MenuAt(int idx) {
			
			for (Menu m : Menu.values()) {
				if (m.ordinal() == idx) {
					return m;
				}
			}
			return null;
			
		}
		
		Menu(String string) {
			
			message = string;
			
		}
		
		String getMessage() {
			return message;
		}
		
	} //end enum Menu <--�ٽ� ���� ����
	
	static Menu SelectMenu() {
		
		int key;
		do {
			for (Menu m : Menu.values()) {
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.TERMINATE.ordinal()) {
					System.out.println();
				}
			}
			System.out.println(" : ");
			key = stdIn.nextInt();
		}
		while (key < Menu.ADD_FIRST.ordinal() || key > Menu.TERMINATE.ordinal());
		return Menu.MenuAt(key);
		
	} //�޴��� ���̰� �ϰ� �޴� ��ȣ�� �Է¹޴� �޼ҵ�
	
	public static void main(String[] args) {
		
		//��ũ�� ����Ʈ �߰�, ����, �˻� �˰���
		Menu menu; //�޴�
		Data data; //�߰��� ������ ����
		Data ptr; //�˻��� ������ ����
		Data temp = new Data(); //�Է¿� ������
		
		LinkedList<Data> list = new LinkedList<Data>();
		
		do {
			switch(menu = SelectMenu()) {
				case ADD_FIRST :
					data = new Data();
					data.scanData("�Ӹ��� ����", Data.NO | Data.NAME);
					list.addFirst(data);
					break;
				case ADD_LAST :
					data = new Data();
					data.scanData("������ ����", Data.NO | Data.NAME);
					list.addLast(data);
					break;
				case RMV_FIRST :
					list.removeFirst();
					break;
				case RMV_Last :
					list.removeLast();
					break;
				case RMV_CRNT :
					list.removeCurrentNode();
					break;
				case SEARCH_No :
					temp.scanData("�˻�", Data.NO);
					ptr = list.search(temp, Data.NO_ORDER);
					if (ptr == null) {
						System.out.println("�� ��ȣ�� �����Ͱ� �����ϴ�.");
					} else {
						System.out.println("�˻� ����: " + ptr);
					}
					break;
				case SEARCH_Name :
					temp.scanData("�˻�", Data.NAME);
					ptr = list.search(temp, Data.NAME_ORDER);
					if (ptr == null) {
						System.out.println("�� ��ȣ�� �����Ͱ� �����ϴ�.");
					} else {
						System.out.println("�˻� ����: " + ptr);
					}
					break;
				case NEXT :
					list.next();
					break;
				case PRINT_CRNT :
					list.printCurrentNde();
					break;
				case DUMP :
					list.dump();
					break;
				case CLEAR :
					list.clear();
					break;
			}
		}
		while (menu != Menu.TERMINATE);
		
	} //end ��ũ�帮��Ʈ Ŭ����
	
}
