package oday03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class �ؽøʵ���� {

	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<Student, Integer>();
//		Map<Student, Integer> map = new HashTable<Student, Integer>();
		
		map.put(new Student(11, "ȫ�浿"), 95);
		map.put(new Student(22, "��浿"), 100);
		map.put(new Student(33, "�̱浿"), 90);
		map.put(new Student(44, "�ֱ浿"), 95);
		map.put(new Student(22, "��浿"), 100);
		map.put(new Student(22, "��浿"), 100);
		
		Set<Student> set = map.keySet();
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			Student key = it.next();
			System.out.println(key + " - " +map.get(key));
		}
		
		
		
	}

}

class Student {
	
	int sno;
	String name;
	
	public Student(int sno, String name) {

		this.sno = sno; //�й�
		this.name = name; //�̸�
	}

	@Override
	public String toString() {
		return sno + " " + name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return name.equals(s.name) && sno == s.sno;
		} else {
			return false;
		}
	}
	
}