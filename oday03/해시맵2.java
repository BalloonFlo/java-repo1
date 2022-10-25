package oday03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ÇØ½Ã¸Ê2 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("3334", 1111);
		map.put("2224", 1112);
		map.put("1114", 1113);
		map.put("1234", 1000);
		
		Set keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print(key + ": ");
			System.out.print(map.get(key) + " / ");
		}
		
	}

}
