package oday03;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableƮ���� {

	public static void main(String[] args) {
		
		//TreeSet�� Person Ŭ������ �޾� �� ���̴�.
		//���� ������ ���� ������ �� ���̴�.
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("a", 21));
		treeSet.add(new Person("b", 23));
		treeSet.add(new Person("c", 25));
		treeSet.add(new Person("d", 26));
		treeSet.add(new Person("e", 28));
		treeSet.add(new Person("k", 29));
		treeSet.add(new Person("c", 20));
		
		Iterator<Person> it = treeSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ": " + age;
	}
	
	public int compareTo(Person o) {
		if (age < o.age) {
			return -1;
		} else if (age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}

}