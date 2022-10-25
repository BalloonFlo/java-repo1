package oday03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class µ¿µî°´Ã¼ÆÇ´Ü {

	public static void main(String[] args) {
		
		Set mSet = new HashSet<Member>();
		
		mSet.add(new Member("È«1", 10));
		mSet.add(new Member("È«2", 20));
		mSet.add(new Member("È«3", 30));
		mSet.add(new Member("È«4", 40));
		mSet.add(new Member("È«5", 50));
		
		Iterator<Member> it = mSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {

		return name + " " + age;
		
	}
	
	//µ¿µî°´Ã¼´Â ÀÌ¸§°ú ³ªÀÌ°¡ °°À¸¸é °°Àº »ç¶÷
	@Override
	public int hashCode() {

		return name.hashCode() + age;
		
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && member.age == age;
		} else {
			return false;
		}
	}
	
}