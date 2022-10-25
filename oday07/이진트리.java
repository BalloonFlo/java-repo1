package oday07;

public class ����Ʈ�� {
	
	public static void main(String[] args) {
		
		//(2)
		//����Ͻ� Ŭ���� - ó���ϴ� ������ �����
		BinarySearchTree bst = new BinarySearchTree();
		//1. �����˻�Ʈ���� �ڷ� �����ϱ�(�����)
		bst.makeTree();
		
		//(4)
		//2. ����(Ʈ���� � ��尡 �ִ��� �˻��ϱ�) 1) �������� 2) �������� 3) ��������
		System.out.println("----------");
		System.out.println("����(InOrder) ���� Left-Rott-Right ");
		bst.inOrder(bst.root);
		System.out.println("----------");
		System.out.println("����(InOrder) ���� Left-Rott-Right ");
		bst.preOrder(bst.root);
		
	}

}

//(3)
class BinarySearchTree {
	
	TreeNode root = null;

	//���� - �����
	public void makeTree() {
		
		String[] words = {"rain", "rainbow", "question", "cloud", "snow", "snowman",
				          "sunny", "cold", "got", "desk", "flower", "survey"};
		for (String w : words) {
			System.out.println(w + " testing");
			insert(w);
		}
		
	}

	private void insert(String data) {
		
		//Ʈ���� �޾��ֱ�
		//���ο� ��带 ���� root�� �ް�
		//data�� ���ؼ� ������ ����� �������� �̵��ϰ�, null�� ã�� ������ ���Ѵ�.
		//data�� ���ؼ� ũ�� ����� ���������� �̵��ϰ�, null�� ã�� ������ ���Ѵ�.
		
		//���ο� ��尡 �� ��ġ ã��
		TreeNode pTrace = root;
		TreeNode pTrace2 = null;
		
		while (pTrace != null) {
			if (pTrace.data.equals(data)) {
				return;
			}
			pTrace2 = pTrace;
			if (pTrace.data.compareTo(data) > 0) { //���� ��� �޷��ִ� �����ͺ��� ���� ���� �����Ͱ� ���� ���
				pTrace = pTrace.left;
			} else {
				pTrace = pTrace.right;
			} 
		} //pTrace2���� �޾��� ����� �θ� ��ġ, pTrace�� �޾��� ����� ��ġ
		
		TreeNode newNode = new TreeNode(data);
		
		if (pTrace == null) {
			root = newNode; //���� ó���� ���
		} else {
			if (pTrace2.data.compareTo(data) > 0) {
				pTrace.left = newNode;
			}
			pTrace.right = newNode;
		}
		
	}
	
	//(5)
	public void inOrder(TreeNode t) {
		
		//�������� Left - Root - Right
		if (t == null) {
			return;
		}
		inOrder(t.left);
		System.out.println(t.data + " ");
		inOrder(t.right);
		
	}
	
	public void preOrder(TreeNode t) {
		
		//�������� Left - Root - Right
		if (t == null) {
			return;
		}
		inOrder(t.left);
		System.out.println(t.data + " ");
		inOrder(t.right);
		
	}
	//�˻�
	//����
	
}

//(1)
class TreeNode {
	
	String data; //�����Ͱ�
	TreeNode left; //���ʿ� �޸��� ���
	TreeNode right; //�����ʿ� �޸��� ���
	
	public TreeNode() {
		
		data = "";
		left = null;
		right = null;
		
	} //�⺻������ �ʱⰪ �ֱ�

	public TreeNode(String data) {

		this.data = data;
		left = null;
		right = null;
		
	} //����� ������ data�� �޾Ƽ� �ν��Ͻ� ������ �־� �ֱ�
	
}
