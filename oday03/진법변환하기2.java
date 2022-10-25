package oday03;

//����Ͻ� Ŭ���� - ��ɾ� ������ Ŭ����(�߾�Ÿ��)
public class ������ȯ�ϱ�2 {

	public static void main(String[] args) {
		
		Util util = new Util();
		System.out.println("** ���� ��ȯ�ϴ� ���α׷� **");
		//10������ 2������ �ٲٱ�
		int n = 14;
		System.out.println("10���� " + n + "�� 2������ �ٲٸ�: " + util.decToBin(n));
		//2������ 10������ �ٲٱ�
		String bn = "1010";
		System.out.println("2���� " + n + "�� 10������ �ٲٸ�: " + util.binToDec(bn));
		
	}

}

//���� ��ȯ�ϴ� Ŭ����
class Util {

	public String decToBin(int value) {

		String result = ""; //����� ����
		int mok, nmg; //��, ������
		mok = value; //ex) mok = 14
		while (mok != 0) {
			nmg = mok % 2; //nmg = 0 ����
			//���� 0�� ���ڷ� ����� String.valueOf(nmg);
			//�����ڵ�ǥ�� ���� 0�� �ڵ�ǥ�� 48��. �׷��� ����(0) + 48�� �ϸ� ���� 0�� ���´�.
			//' ': ���� 1����, " ": ���ڿ� 1���� �̻�
			result += (char)(nmg + '0');
			mok = mok / 2;
		}
		//���ڿ��� �� ����� �ݴ�� ������
		//String ---> char[]
		char[] r = result.toCharArray();
		for (int i = 0; i < r.length / 2; i++) {
			char temp = r[i];
			r[i] = r[r.length - i - 1]; //i=0�� �� r[0] <--> r[3] i=1�� �� r[1] <--> r[2]
			r[r.length - i - 1] = temp;
		}
		//char[] --> String ���� �ٲٱ�
		return String.valueOf(r);
		
	}
	
	//2������ 10������ �ٲ��ִ� �޼ҵ�
	public int binToDec(String value) {
		
		int result = 0;
		for (int i = 0; i < value.length(); i++) {
			result = result * 1 + value.charAt(i) - '0'; //'1'-'0' = 49-48 = 1
		}
		return result;
	}
	
}