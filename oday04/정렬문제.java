package oday04;

import java.util.Arrays;

public class 정렬문제 {
	
	public static void main(String[] args) {
		String data[] = {"권수진", "최명진", "한경미", "박현진", "서유미"};
		Arrays.sort(data );
		for (String i : data) {
			System.out.print(i + " ");
		}
	}	
}

