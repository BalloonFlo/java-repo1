package oday03;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Ʈ���� {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87); //java version 9.0 ���Ͽ����� new Integer(87)
		scores.add(88);
		scores.add(89);
		scores.add(90);
		scores.add(91);
		scores.add(92);
		
		Integer score = null;
		score = scores.first();
		System.out.println("���� ���� ����: " + score);
		score = scores.last();
		System.out.println("���� ���� ����: " + score);
		score = scores.lower(90);
		System.out.println("90������ �ٷ� �Ʒ� ����: " + score);
		score = scores.higher(90);
		System.out.println("90������ �ٷ� �� ����: " + score);
		
		NavigableSet<Integer> desendingSet = scores.descendingSet();
		for (Integer score1 : desendingSet) {
			System.out.print(score1 + " ");
		}
		System.out.println();
		NavigableSet<Integer> desendingSet1 = desendingSet.descendingSet();
		for (Integer score1 : desendingSet1) {
			System.out.print(score1 + " ");
		}
		
	}

}
