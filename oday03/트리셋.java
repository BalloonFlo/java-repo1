package oday03;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class 트리셋 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87); //java version 9.0 이하에서는 new Integer(87)
		scores.add(88);
		scores.add(89);
		scores.add(90);
		scores.add(91);
		scores.add(92);
		
		Integer score = null;
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		score = scores.last();
		System.out.println("가장 높은 점수: " + score);
		score = scores.lower(90);
		System.out.println("90점보다 바로 아래 점수: " + score);
		score = scores.higher(90);
		System.out.println("90점보다 바로 윗 점수: " + score);
		
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
