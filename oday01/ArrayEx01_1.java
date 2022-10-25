package oday01;

public class ArrayEx01_1 {

	public static void main(String[] args) {
		
		//문제1. 1차원 배열에 데이터 입력하고 출력하기
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = 100 * i + 100;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		//향상된 for문으로 출력하기
		for (int n : a) {
			System.out.print(n + ": 이곳을 찍어보자\t");
		}
		System.out.println();
		
		System.out.println("--------------------");
		//문제2. 2차원 배열에 데이터 입력하고 출력하기 
		int[][] b = new int[2][3];
		int num = 100;
		int[] sum = new int[2];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = num;
				sum[i] += b[i][j];
				num -= 5;
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println(sum[i]);
		}
		//향상된 for문으로 출력하기
		for (int[] bb : b) {
			for (int bbb : bb) {
				System.out.print(bbb + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("--------------------");
		//문제3. 3차원 배열에 데이터 입력하고 출력하기 
		String[][][] c = {{{"a", "b"}, {"c", "d"}, {"e" ,"f"}},
						   {{"a", "b"}, {"c", "d"}, {"e" ,"f"}}
		};
		//for문 점자문을 이용해서 찍기
		//면의 갯수 찍기, 행의 갯수 찍기, 열의 갯수 찍기
		System.out.println("면의 갯수: " + c.length);
		System.out.println("행의 갯수: " + c[0].length);
		System.out.println("열의 갯수: " + c[0][0].length);
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int j2 = 0; j2 < c[i][j].length; j2++) {
					System.out.print(c[i][j][j2] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		//향상된 for문으로 찍기
		for (String[][] cc : c) {
			for (String[] ccc : cc) {
				for (String cccc : ccc) {
					System.out.print(cccc + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}

}
