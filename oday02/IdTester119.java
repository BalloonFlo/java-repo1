package oday02;

public class IdTester119 {

	public static void main(String[] args) {
		
		//���� �޼ҵ� ȣ�� ����� Ŭ������.�޼ҵ��()
		Id.getCounter(); 
		
		Id a = new Id();
		Id b = new Id();
		
		//�ν��Ͻ� �޼ҵ� ȣ�� ����� ��������.�޼ҵ��()
		a.getId();
		b.getId();
		
	}
	
	static {
		System.out.println("�̰��� ���� �����.");
	}

}

class Id {
	
	private static int counter = 0; //����(Ŭ����) ���� ���� ���������� �ٷ� �޸� �ö�
	
	private int id; //�ν��Ͻ�(��ü) ���� new�� �ν��Ͻ�ȭ�� �Ŀ� �� �޸𸮿� �ö�(�Ҵ��)
	
	
	public Id() {
		id = ++counter;
		System.out.println("������ �κ���.");
	}
	
	public static int getCounter() { //���� �޼ҵ�
		return counter;
	}
	
	public int getId() {
		return id; 
	}
	
	{
		System.out.println("��� �κ���.");
	}
	
	static {
		System.out.println("�̰��� ���� �����.");
	}
	
}
