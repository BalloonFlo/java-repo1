package oday05;

public class 병합정렬 {

	public static void main(String[] args) {
		int[] a = {2, 4, 6, 8, 11, 13};
		int[] b = {1, 2, 3, 4, 9, 16, 21};
		int[] c = new int[13];
		
		mergeSort(a, a.length, b, b.length, c);
		
		for (int cc : c) {
			System.out.printf("%3d", cc);
		}
	}

	private static void mergeSort(int[] a, int al, int[] b, int bl, int[] c) {
		int pa = 0;
		int pb = 0;
		int pc = 0;
		
		while (pa < al & pb < bl) {
			c[pc++] = (a[pa] <= b[pb]) ? a[pa++] : b[pb++];
		} 
		while (pa < al) {
			c[pc++] = a[pa++];
		}
		while (pb < bl) {
			c[pc++] = b[pb++];
		}
	}

}
