package oday06;

import java.util.Comparator;

public class LinkedList<E> {
//p.299 �ǽ� 8-1[A], p.300 �ǽ� 8-1[B], p.302 �ǽ� 8-1[C], p.304 �ǽ� 8-1[D], p.305 �ǽ� 8-1[E]
//p.306 �ǽ� 8-1[F], p.307 �ǽ� 8-1[G], p.309 �ǽ� 8-1[H]
//p.311 �ǽ� 8-1[I]

	class Node<E> {
		
		private E data; //���� �����͸� ���� ����
		private Node<E> next; //���� ��带 ����Ű�� �ּҸ� ���� ����
		
		public Node(E data, Node<E> next) {
			
			this.data = data;
			this.next = next;
			
		}
		
	} //end Node class
	
	private Node<E> head; //�Ӹ�����Ʈ(���� ��� �ּҸ� ��� ��)
	private Node<E> crnt; //��������Ʈ(���� ��� �ּҸ� ��� ��)
	
	public LinkedList() {
		
		head = null; //��� �ִ� ����Ʈ ���� head==null 1�� head.next==null
		crnt = null; //���� ����� ���� �Ǵ� ���� p.next==null
		
	}
	
	public E search(E obj, Comparator<? super E> c) {
		
		Node<E> ptr = head; //���� ��ĵ ���� ��� �ּ�
		while (ptr != null) {
			if (c.compare(obj, ptr.data) == 0) {
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next;
		}
		return null;
		
	} //�˻�
	
	public void addFirst(E obj) {
		
		Node<E> ptr = head;
		head = crnt = new Node<E>(obj, ptr);
		
	} //ó�� ��带 �����ϱ�
	
	public void addMid(E obj) {
		
		//������ "B"�� ���޹޾Ƽ�
		
		
	} //�߰��� ��� �����ϱ�
	
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
		
	} //���� ��� �����ϱ�
	
	public void removeFirst() {
		
		if (head != null) {
			head = crnt = head.next;
		}
		
	} //�Ӹ� ��� ����
	
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
		
	} //�߰� ��� ����
	
	public void removeLast() {
		
		if (head != null) {
			if (head.next == null) {
				removeFirst();
			} else {
				Node<E> ptr = head; //��ĵ���� ���
				Node<E> pre = head; //��ĵ���� ��� ���� ���
				while (ptr.next != null) {
					pre = ptr;
					ptr = ptr.next;
				}
				pre.next = null;
				crnt = pre;
			}
		}
		
	} //���� ��� ����
	
	public void removeCurrentNode() {
		
		remove(crnt);
		
	} //���� ��� ����
	
	public void clear() {
		
		while (head != null) {
			removeFirst();
		}
		crnt = null;
		
	} //��ü ��� ����
	
	public boolean next() {
		
		if (crnt == null || crnt.next == null) {
			return false;
		}
		crnt = crnt.next;
		return true;
		
	} //����(��)�� ��尡 �ִ��� �Ǵ�
	
	public void printCurrentNode() {
		
		if (crnt == null) {
			System.out.println("������ ��尡 �����ϴ�.");
		} else {
			System.out.println(crnt.data);
		}
		
	} //���� ���õ� ��� ���
	
	public void dump() {
		
		Node<E> ptr = head;
		while (ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
		
	} //��ü ��� ���
	
}
