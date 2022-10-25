package oday03;

//비즈니스 클래스 - 명령어 내리는 클래스(중앙타워)
public class 진법변환하기2 {

	public static void main(String[] args) {
		
		Util util = new Util();
		System.out.println("** 진법 변환하는 프로그램 **");
		//10진수를 2진수로 바꾸기
		int n = 14;
		System.out.println("10진수 " + n + "를 2진수로 바꾸면: " + util.decToBin(n));
		//2진수를 10진수로 바꾸기
		String bn = "1010";
		System.out.println("2진수 " + n + "를 10진수로 바꾸면: " + util.binToDec(bn));
		
	}

}

//진법 변환하는 클래스
class Util {

	public String decToBin(int value) {

		String result = ""; //결과값 변수
		int mok, nmg; //몫, 나머지
		mok = value; //ex) mok = 14
		while (mok != 0) {
			nmg = mok % 2; //nmg = 0 숫자
			//숫자 0을 문자로 만들기 String.valueOf(nmg);
			//유니코드표에 문자 0은 코드표로 48다. 그래서 숫자(0) + 48을 하면 문자 0이 나온다.
			//' ': 문자 1글자, " ": 문자열 1글자 이상
			result += (char)(nmg + '0');
			mok = mok / 2;
		}
		//문자열로 된 결과를 반대로 뒤집기
		//String ---> char[]
		char[] r = result.toCharArray();
		for (int i = 0; i < r.length / 2; i++) {
			char temp = r[i];
			r[i] = r[r.length - i - 1]; //i=0일 때 r[0] <--> r[3] i=1일 때 r[1] <--> r[2]
			r[r.length - i - 1] = temp;
		}
		//char[] --> String 으로 바꾸기
		return String.valueOf(r);
		
	}
	
	//2진수를 10진수로 바꿔주는 메소드
	public int binToDec(String value) {
		
		int result = 0;
		for (int i = 0; i < value.length(); i++) {
			result = result * 1 + value.charAt(i) - '0'; //'1'-'0' = 49-48 = 1
		}
		return result;
	}
	
}