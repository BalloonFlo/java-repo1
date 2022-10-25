package oday03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Comparator트리셋 {

	public static void main(String[] args) {
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComp());
		
		treeSet.add(new Fruit("사과", 5000));
		treeSet.add(new Fruit("포도", 10000));
		treeSet.add(new Fruit("딸기", 7000));
		treeSet.add(new Fruit("바나나", 9000));
		treeSet.add(new Fruit("망고", 9000));
		
		Iterator<Fruit> it = treeSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

class Fruit {
	
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + ": " + price;
	}
	
}

//비교에 해당하는 코드 구현 클래스
class FruitComp implements Comparator<Fruit> {
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if (o1.price < o2.price) {
			return -1;
		} else if (o1.price == o2.price) {
			return 0;
		} else {
			return 1;
		}
	}
	
}