package oday02;

public class ��ü�����˻�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A implements Comparable<A> {
	int age;
	String name;
	@Override
	public int compareTo(A o) {
		if (age < o.age) return 1;
		else if (age < o.age) return -1;
		else if (age == o.age) return 0;
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		A o = (A)obj;
		if (age == o.age) return true;
		if (age != o.age) return false;
		return super.equals(obj);
	}
	
}