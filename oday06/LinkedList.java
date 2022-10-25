package oday06;

import java.util.Comparator;

public class LinkedList<E> {
//p.299 실습 8-1[A], p.300 실습 8-1[B], p.302 실습 8-1[C], p.304 실습 8-1[D], p.305 실습 8-1[E]
//p.306 실습 8-1[F], p.307 실습 8-1[G], p.309 실습 8-1[H]
//p.311 실습 8-1[I]

	class Node<E> {
		
		private E data; //실제 데이터를 담을 변수
		private Node<E> next; //다음 노드를 가르키는 주소를 담을 변수
		
		public Node(E data, Node<E> next) {
			
			this.data = data;
			this.next = next;
			
		}
		
	} //end Node class
	
	private Node<E> head; //머리포인트(시작 노드 주소를 담는 곳)
	private Node<E> crnt; //선택포인트(선택 노드 주소를 담는 곳)
	
	public LinkedList() {
		
		head = null; //비어 있는 리스트 조건 head==null 1개 head.next==null
		crnt = null; //꼬리 노드인 것을 판단 조건 p.next==null
		
	}
	
	public E search(E obj, Comparator<? super E> c) {
		
		Node<E> ptr = head; //현재 스캔 중인 노드 주소
		while (ptr != null) {
			if (c.compare(obj, ptr.data) == 0) {
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}
		return null;
		
	} //검색
	
	public void addFirst(E obj) {
		
		Node<E> ptr = head;
		head = crnt = new Node<E>(obj, ptr);
		
	} //처음 노드를 삽입하기
	
	public void addMid(E obj) {
		
		//삽입할 "B"를 전달받아서
		
		
	} //중간에 노드 삽입하기
	
	public void addLast(E obj) {
		
		if (head == null) {
			addFirst(obj);
		} else {
			Node<E> ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = crnt = new Node<E>(obj, null);
		}
		
	} //끝에 노드 삽입하기
	
	public void removeFirst() {
		
		if (head != null) {
			head = crnt = head.next;
		}
		
	} //머리 노드 삭제
	
	public void remove(Node p) {
		
		if (head != null) {
			if (p == head) {
				removeFirst();
			} else {
				Node<E> ptr = head;
				while(ptr.next != p) {
					ptr = ptr.next;
					if (ptr == null) {
						return;
					}
				}
				ptr.next = p.next;
				crnt = ptr;
			}
		}
		
	} //중간 노드 삭제
	
	public void removeLast() {
		
		if (head != null) {
			if (head.next == null) {
				removeFirst();
			} else {
				Node<E> ptr = head; //스캔중인 노드
				Node<E> pre = head; //스캔중인 노드 앞의 노드
				while (ptr.next != null) {
					pre = ptr;
					ptr = ptr.next;
				}
				pre.next = null;
				crnt = pre;
			}
		}
		
	} //꼬리 노드 삭제
	
	public void removeCurrentNode() {
		
		remove(crnt);
		
	} //선택 노드 삭제
	
	public void clear() {
		
		while (head != null) {
			removeFirst();
		}
		crnt = null;
		
	} //전체 노드 삭제
	
	public boolean next() {
		
		if (crnt == null || crnt.next == null) {
			return false;
		}
		crnt = crnt.next;
		return true;
		
	} //다음(뒤)에 노드가 있는지 판단
	
	public void printCurrentNode() {
		
		if (crnt == null) {
			System.out.println("선택한 노드가 없습니다.");
		} else {
			System.out.println(crnt.data);
		}
		
	} //현재 선택된 노드 출력
	
	public void dump() {
		
		Node<E> ptr = head;
		while (ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
		
	} //전체 노드 출력
	
}
