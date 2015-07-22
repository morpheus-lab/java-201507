package linkedlist;

public class LinkedList {
	
	Node head;	// 첫 번째 노드의 참조값을 저장할 변수
	Node tail;	// 마지막 노드의 참조값을 저장할 변수
	
	// 이 연결리스트에 데이터를 저장하는 메소드
	public void add(int data) {
		Node newNode = new Node();	// 새 데이터를 담을 노드 객체 생성
		newNode.data = data;
		
		if (head == null) {	// 첫 번째 노드
			head = newNode;
			tail = newNode;
		}/* else {
			Node tail = head;
			while (tail.next != null) {
				tail = tail.next;
			}
			// 여기서 tail은 누구? 새 데이터 들어오기 전 마지막 노드
			tail.next = newNode;
		}*/
		else {	// 두 번째 노드 이상
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








