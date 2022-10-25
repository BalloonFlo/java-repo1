package oday02;

import java.util.Arrays;
import java.util.Comparator;

public class ��ü�����˻�2 {

	public static void main(String[] args) {
		
		Person[] pArr = {new Person(10, "ȫ"), new Person(20, "��"),
						 new Person(27, "��"), new Person(25, "��")
		};
		int idx = Arrays.binarySearch(pArr, new Person(20, ""), Person.AGE_ORDER);
		System.out.println(idx + " ");
		if (idx < 0) System.out.println("�����ϴ�.");
		else System.out.println("�� ���� " + idx + "�� �ֽ��ϴ�.");
			 System.out.println("ã�� �����ʹ� " pArr[idx] + " �Դϴ�.");
	}
	
}

class Person {
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return name + " " + age;
	}
	public static final Comparator<Person> AGE_ORDER = new AgeComparator();
}

class AgeComparator implements Comparator<Person> {
	//���̸� ������ �������� ��� �ڵ� ����
	@Override
	public int compare(Person o1, Person o2) {
		return o1.age - o2.age;
	}
}