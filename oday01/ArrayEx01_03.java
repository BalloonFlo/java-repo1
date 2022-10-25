package oday01;

public class ArrayEx01_03 {

	public static void main(String[] args) {

		String[][] s = new String[5][2];
		
		s[0][0] = "0397134";
		s[0][1] = "±èÈ¿Áø";
		s[1][0] = "0465345";
		s[1][1] = "ÀÌÁ¾Çù";
		s[2][0] = "0427214";
		s[2][1] = "¼­»óÃá";
		s[3][0] = "0487342";
		s[3][1] = "¹è¿µ¹Ì";
		s[4][0] = "0512478";
		s[4][1] = "±è¿¹Áø";
		
		
		for (String[] ss : s) {
			for (String sss : ss) {
				System.out.print(sss + "\t");
			}
			System.out.println();
		}
		
//		String[][] so = new String[5][2];
//		int hakburn = Integer.parseInt(s[0][0]);
//		int miniHakburnIndex = 0;
//		int miniHakburn = hakburn;
//		int soIndex = 0;
//		for (int k = 0; k < so.length; k++) {
//			for (int i = 0; i < so.length; i++) {
//				if (hakburn > Integer.parseInt(s[i][0])) {
//					miniHakburn = Integer.parseInt(s[i][0]);
//					miniHakburnIndex = i;
//				}
//			}
//			so[soIndex][0] = String.valueOf(miniHakburn);
//			so[soIndex][1] = s[miniHakburnIndex][1];
//			soIndex++;
//			
//			System.out.println(miniHakburn + " " + miniHakburnIndex);
//			System.out.println(so[soIndex][0] + " " + so[soIndex][1]);
//			s[miniHakburnIndex][0] = "»èÁ¦µÊ";
//			°íÄ¥¿¹Á¤.
//		}

	}

}
