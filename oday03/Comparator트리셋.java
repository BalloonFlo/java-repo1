package oday03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorƮ���� {

	public static void main(String[] args) {
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComp());
		
		treeSet.add(new Fruit("���", 5000));
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 7000));
		treeSet.add(new Fruit("�ٳ���", 9000));
		treeSet.add(new Fruit("����", 9000));
		
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

//�񱳿� �ش��ϴ� �ڵ� ���� Ŭ����
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