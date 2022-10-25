package oday02;

public class ���̾��˻� {

	public static void main(String[] args) {
		
		String txt = "ABABCDEFGHA";
		String pat = "ABC";
		
		int idx = bmMatch(txt, pat);
		if (idx == -1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println("�� ���� txt[" + idx + "]�� �ֽ��ϴ�.");
		}
		
	}

	private static int bmMatch(String txt, String pat) {
		
		int pt; //txtĿ��
		int pp; //patĿ��
		int txtLen = txt.length(); //11
		int patLen = pat.length(); //3
		
		int[] skip = new int[Character.MAX_VALUE + 1]; //�ǳʶٱ� ǥ�� ũ��� 65535
		for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
			skip[pt] = patLen;
		}
		for (pt = 0; pt <= patLen - 1; pt++) {
			skip[pat.charAt(pt)] = patLen - pt -1;
		}
		//�ǳʶٱ� ǥ�� ���� ���
//		for (pt = 0; pt <= Character.MAX_VALUE; pt++) {
//			System.out.print(skip[pt] + " ");
//		}
		
		while (pt < txtLen) {
			pp = patLen -1;
			while (txt.charAt(pt) == pat.charAt(pp)) {
				if (pp == 0) {
					return pt; //����
				}
				pp--;
				pt--;
			}
			pt += (skip[txt.charAt(pt)] > patLen - pp) ? skip[txt.charAt(pt)]
			: patLen - pp;
		}
		return -1;
	}

}
