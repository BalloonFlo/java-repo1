package oday02;

import java.util.Arrays;
import java.util.Comparator;

public class 객체이진검색2 {

	public static void main(String[] args) {
		
		Person[] pArr = {new Person(10, "홍"), new Person(20, "김"),
						 new Person(27, "최"), new Person(25, "이")
		};
		int idx = Arrays.binarySearch(pArr, new Person(20, ""), Person.AGE_ORDER);
		System.out.println(idx + " ");
		if (idx < 0) System.out.println("없습니다.");
		else System.out.println("그 값은 " + idx + "에 있습니다.");
			 System.out.println("찾는 데이터는 " pArr[idx] + " 입니다.");
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
	//나이를 정렬의 기준으로 삼는 코드 구현
	@Override
	public int compare(Person o1, Person o2) {
		return o1.age - o2.age;
	}
}