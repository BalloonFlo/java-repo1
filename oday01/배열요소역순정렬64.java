package oday01;

public class �迭��ҿ�������64 {

	public static void main(String[] args) {
		
		//�����ϱ�
		int[] iArr = {2, 5, 1, 3, 9, 6, 7};
		
		//�迭�� ��Ҹ� �������� �����ϱ�
		for (int i = 0; i < iArr.length; i++) {
			swap (iArr, i, iArr.length - i - 1);
		}
		
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}

}
