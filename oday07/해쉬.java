package oday07;

public class �ؽ� {

	public static void main(String[] args) {
		
		Hash hash = new Hash();
		hash.createHashTable();
		hash.display();
		hash.search("����");
		hash.search("���");
		
	}

}

class Hash {
	
	int BUCKET_SIZE = 10;
	Node[] bucket = new Node[BUCKET_SIZE];
	
	public Hash() {
	
		for (int i = 0; i < BUCKET_SIZE; i++) {
			bucket[i] = new Node();
		}
	
	}

	public void search(String string) {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
	}

	public void createHashTable() {
		
		String[] words = new String[] {"�б�", "������", "���", "����", "�����"};
		for (String w : words) {
			insert(w);
		}
		
	}

	private void insert(String data) {
		
		int hash = getHash(data);
		
	}

	private int getHash(String data) {
		
		int i, sum = 0;
		for (int i = 0; i < data.length(); i++) { //�����ڰ� ���Ƿ� �ؽ��Լ��� ������ ����
			sum += data.charAt(i);
		}
		return sum % BUCKET_SIZE;
	}
	
}

class Node {
	
	String data = "";
	Node next = null;
	
}