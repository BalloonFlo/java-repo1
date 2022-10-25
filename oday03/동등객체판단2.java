package oday03;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class 悼殿按眉魄窜2 {

	public static void main(String[] args) {
		
		Set mSet2 = new HashSet<Member2>();
		
		mSet2.add(new Member2("全1", "010-1234-5678");
		mSet2.add(new Member2("全2", "010-2345-6789");
		mSet2.add(new Member2("全3", "010-3456-7890");
		mSet2.add(new Member2("全4", "010-4567-8901");
		
	}

}

class Member2 {
	
	private String name;
	private String tel;
	
	public Member2(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	@Override
	public String toString() {
		
		return name + " " + tel;
		
	}
	
	@Override
	public String hashCode() {

		return name.hashCode() + tel.ha;
		
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member2) {
			Member2 member = (Member2) obj;
			return member.name.equals(name) && member.tel.equals(tel);
		} else {
			return false;
		}
		
	}

}