package oday03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ÇØ½Ã¼Â {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("AA");
		set.add("BB");
		set.add("CC");
		set.add("BB");
		set.add("AA");
		set.add("DD");
		
		System.out.println(set.size());
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}

}
