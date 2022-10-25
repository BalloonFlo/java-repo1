package oday02;

public class IdTester119 {

	public static void main(String[] args) {
		
		//정적 메소드 호출 방법은 클래스명.메소드명()
		Id.getCounter(); 
		
		Id a = new Id();
		Id b = new Id();
		
		//인스턴스 메소드 호출 방법은 참조변수.메소드명()
		a.getId();
		b.getId();
		
	}
	
	static {
		System.out.println("이곳은 정적 블록임.");
	}

}

class Id {
	
	private static int counter = 0; //정적(클래스) 변수 선언 컴파일하자 바로 메모리 올라감
	
	private int id; //인스턴스(객체) 변수 new로 인스턴스화한 후에 합 메모리에 올라감(할당됨)
	
	
	public Id() {
		id = ++counter;
		System.out.println("생성자 부분임.");
	}
	
	public static int getCounter() { //정적 메소드
		return counter;
	}
	
	public int getId() {
		return id; 
	}
	
	{
		System.out.println("블록 부분임.");
	}
	
	static {
		System.out.println("이곳은 정적 블록임.");
	}
	
}
