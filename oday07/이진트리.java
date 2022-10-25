package oday07;

public class 이진트리 {
	
	public static void main(String[] args) {
		
		//(2)
		//비즈니스 클래스 - 처리하는 내용을 만들기
		BinarySearchTree bst = new BinarySearchTree();
		//1. 이진검색트리에 자료 삽입하기(만들기)
		bst.makeTree();
		
		//(4)
		//2. 운행(트리에 어떤 노드가 있는지 검색하기) 1) 중위운행 2) 전위운행 3) 후위운행
		System.out.println("----------");
		System.out.println("중위(InOrder) 운행 Left-Rott-Right ");
		bst.inOrder(bst.root);
		System.out.println("----------");
		System.out.println("중위(InOrder) 운행 Left-Rott-Right ");
		bst.preOrder(bst.root);
		
	}

}

//(3)
class BinarySearchTree {
	
	TreeNode root = null;

	//삽입 - 만들기
	public void makeTree() {
		
		String[] words = {"rain", "rainbow", "question", "cloud", "snow", "snowman",
				          "sunny", "cold", "got", "desk", "flower", "survey"};
		for (String w : words) {
			System.out.println(w + " testing");
			insert(w);
		}
		
	}

	private void insert(String data) {
		
		//트리에 달아주기
		//새로운 노드를 만들어서 root에 달고
		//data를 비교해서 작으면 노드의 왼쪽으로 이동하고, null을 찾을 때까지 비교한다.
		//data를 비교해서 크면 노드의 오른쪽으로 이동하고, null을 찾을 때까지 비교한다.
		
		//새로운 노드가 들어갈 위치 찾기
		TreeNode pTrace = root;
		TreeNode pTrace2 = null;
		
		while (pTrace != null) {
			if (pTrace.data.equals(data)) {
				return;
			}
			pTrace2 = pTrace;
			if (pTrace.data.compareTo(data) > 0) { //참인 경우 달려있는 데이터보다 새로 들어온 데이터가 작은 경우
				pTrace = pTrace.left;
			} else {
				pTrace = pTrace.right;
			} 
		} //pTrace2에는 달아줄 노드의 부모 위치, pTrace에 달아줄 노드의 위치
		
		TreeNode newNode = new TreeNode(data);
		
		if (pTrace == null) {
			root = newNode; //제일 처음인 경우
		} else {
			if (pTrace2.data.compareTo(data) > 0) {
				pTrace.left = newNode;
			}
			pTrace.right = newNode;
		}
		
	}
	
	//(5)
	public void inOrder(TreeNode t) {
		
		//중위운행 Left - Root - Right
		if (t == null) {
			return;
		}
		inOrder(t.left);
		System.out.println(t.data + " ");
		inOrder(t.right);
		
	}
	
	public void preOrder(TreeNode t) {
		
		//중위운행 Left - Root - Right
		if (t == null) {
			return;
		}
		inOrder(t.left);
		System.out.println(t.data + " ");
		inOrder(t.right);
		
	}
	//검색
	//삭제
	
}

//(1)
class TreeNode {
	
	String data; //데이터값
	TreeNode left; //왼쪽에 달리는 노드
	TreeNode right; //오른쪽에 달리는 노드
	
	public TreeNode() {
		
		data = "";
		left = null;
		right = null;
		
	} //기본생성자 초기값 넣기

	public TreeNode(String data) {

		this.data = data;
		left = null;
		right = null;
		
	} //명시적 생성자 data를 받아서 인스턴스 변수에 넣어 주기
	
}
