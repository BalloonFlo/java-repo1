package oday03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class �ؽø� {

	public static void main(String[] args) {
		
		//Map
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü �����ϱ�
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("d", 100);
		map.put("d", 200);
		map.put("d", 300);
		
		//��ü �˻��ϱ�
		System.out.println(map.get("b"));
		System.out.println(map.get("e"));
		
		//��� ���� �� ����ϱ�
		//1�ܰ� key�� ������
		Set keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print(key + ": ");
			System.out.print(map.get(key) + " / ");
		}

	}

}
