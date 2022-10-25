package oday02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import javax.sql.rowset.serial.SerialArray;

public class ��ü�����˻� {

	public static void main(String[] args) {
		
		//1. student Ŭ������ ��üȭ�Ͽ��� �迭�� ��� �д�.
		Student[] sArr = {new Student("������", 162, 0.3),
						  new Student("�̼���", 172, 0.5),
						  new Student("Ȳ����", 156, 1.0),
						  new Student("������", 173, 1.2)
		};
		
		//2. �˻����� Ű ���� �Է��� �޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� ���� Ű�� �Է��� �ּ���.");
		int key = sc.nextInt();
//		Arrays.binarySearch(sArr, key); //error why �ּҸ� ã�°� �ƴ϶� ��ü �ʵ��� Ű�� ã�ƾ� �Ѵ�.
		int idx = Arrays.binarySearch(sArr, new Student("", key, 0.0), Student.HEIGHT_ORDER);
		if (idx == 9999) System.out.println(key + "Ű�� �����ϴ�.");
		else System.out.println("�� ���� " + idx + "�� �ֽ��ϴ�.");
			 System.out.println("ã�� �����ʹ� " + sArr[idx] + " �Դϴ�.");
	}

}

class Student {
	
	String name; //�̸�
	int height; //Ű
	double vision; //�÷�
	
	public Student(String name, int height, double vision) {
		super();
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	
	//�ֻ��� Ŭ������ Object Ŭ������ �޼ҵ��� toString()�� �������ؼ� �ڽ� Ŭ�������� ���������� ������� �� �ְ� ���� ���� �ڵ� ������ �� �ִ�.
	@Override
	public String toString() {
		return name + " " + height + " " + vision;
	}
	
	//���ó��
	public static final Comparator<Student> HEIGHT_ORDER = new HeightComparator();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getVision() {
		return vision;
	}

	public void setVision(double vision) {
		this.vision = vision;
	}
	
}

class HeightComparator implements Comparator<Student> {
	//o1�� �̹� �� �ڷ� o2�� ���� ���� �ڷ�
	@Override
	public int compare(Student o1, Student o2) {
		System.out.println("�̰��� Ű�� �����ϱ� ���� ������ �����ϴ� �κ���.");
		return (o1.height > o2.height) ? 1 : (o1.height == o2.height) ? 0 : (o1.height < o2.height) ? -1 : 9999;
//		return (o1.height - o2.height);
	}
	
}

