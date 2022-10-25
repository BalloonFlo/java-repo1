package oday03;

	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Set;
	
	public class ���ü�Ǵ�2_1 {
		
	public static void main(String[] args) {
		
		Set<Persone> set_ = new HashSet<Persone>();
		
		set_.add(new Persone("010-1234-1234", "ȫ�浿", 1));
		set_.add(new Persone("010-1234-1234", "ȫ�浿2", 1));
		set_.add(new Persone("010-1234-1234", "ȫ�浿3", 1));
		set_.add(new Persone("010-1234-1234", "ȫ�浿", 2));
		set_.add(new Persone("010-1234-1234", "ȫ�浿", 3));
		set_.add(new Persone("010-1234-1234", "ȫ�浿", 4));
		
		Iterator<Persone> it = set_.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
class Persone{
	
	String tel;
	String name;
	int total;
	
	public Persone(String tel, String name, int total) {
		super();
		this.tel = tel;
		this.name = name;
		this.total = total;
	}
	@Override
	public String toString() {
		return "Persone [tel=" + tel + ", name=" + name + ", total=" + total + "]";
	}
	
	@Override
	public int hashCode() {
	
		return name.hashCode() + tel.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(obj instanceof Persone) {
			Persone Persone = (Persone)obj;
			return Persone.tel.equals(tel) && Persone.name.equals(name);
		}
		return false;
	}
}