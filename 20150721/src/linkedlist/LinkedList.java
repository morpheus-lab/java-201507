package linkedlist;

public class LinkedList {
	
	Node head;	// ù ��° ����� �������� ������ ����
	Node tail;	// ������ ����� �������� ������ ����
	
	// �� ���Ḯ��Ʈ�� �����͸� �����ϴ� �޼ҵ�
	public void add(int data) {
		Node newNode = new Node();	// �� �����͸� ���� ��� ��ü ����
		newNode.data = data;
		
		if (head == null) {	// ù ��° ���
			head = newNode;
			tail = newNode;
		}/* else {
			Node tail = head;
			while (tail.next != null) {
				tail = tail.next;
			}
			// ���⼭ tail�� ����? �� ������ ������ �� ������ ���
			tail.next = newNode;
		}*/
		else {	// �� ��° ��� �̻�
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	public void print() {
		Node node = head;
		System.out.print("{");
		while (node != null) {
			if (node != head) {
				System.out.print(", ");
			}
			System.out.print(node.data);
			node = node.next;
		}
		System.out.println("}");
	}
	
}








