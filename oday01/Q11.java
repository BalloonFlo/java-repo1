package oday01;

public class Q11 { //page46

	public static void main(String[] args) {
		
		//구구단 곱셈표 프로그램
		System.out.printf("%6s", "|");
		
		for(int i=1; i<10;i++) {
			System.out.printf("%3d", i);
		}
		
		System.out.println();
		System.out.println("-----+------------------------");
		
		for( int i=1; i<10; i++) {
			System.out.printf("%3d", i);
			System.out.printf("%3s", "|");
			for( int j=1; j<10; j++) {
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}

		
		//근의 공식을 가지고 해를 구하기
		double x1, x2, a = 10.0, b = 13.0, c = 12.0;
		
		System.out.println(b*b - 4*a*c);
		
		x1 = -b + Math.sqrt(Math.abs(b*b - 4*a*c)) / 2*a;
		x2 = -b - Math.sqrt(Math.abs(b*b - 4*a*c)) / 2*a;
		
		System.out.println(x1);
		System.out.println(x2);
		
	}

}
