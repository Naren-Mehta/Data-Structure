package linkedlist;



public class LinkedListDemo {
	
	public static Node createALinkedListWithNodes(int... arr) {
		
		Node head = null;
		
		for(int x: arr) {
			head = LinkedListDemo.insertNodeAtEnd(x, head);
		}
		return head;
	}

	public static Node insertNodeAtEnd(int value, Node head) {

		if (head == null) {
			head = new Node(value);
		} else {
			Node node = new Node(value);
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}

		return head;
	}
	
	public static Node insertNodeAtBiginning(int value, Node head) {

		Node node = new Node(value);

		if (head != null) {
			node.next=head;
			return node;
		} 
		
		return node;
	}

	public static Node insertNodeAtIndex(int value, Node head, int position) {

		Node newNode = new Node(value);
		if (head == null && position == 0) {
			head = newNode;
		} else {
			Node currentNode = head;
			int count = 0;
			while (currentNode.next != null) {
				if (count == position-1) {
					newNode.next = currentNode.next;
					currentNode.next = newNode;
					break;
				}

				currentNode = currentNode.next;
				count++;
			}
		}

		return head;
	}

	public static void main(String[] args) {

		Node head = insertNodeAtEnd(2, null);
		head = insertNodeAtEnd(4, head);
		head = insertNodeAtEnd(6, head);
		head = insertNodeAtEnd(8, head);
		head = insertNodeAtEnd(10, head);

		printLinkedList(head);

		head = insertNodeAtIndex(100, head, 3);

		printLinkedList(head);
		
		head= insertNodeAtBiginning(200,head);
		head= insertNodeAtBiginning(201,head);
		head= insertNodeAtBiginning(202,head);
		head= insertNodeAtBiginning(203,head);
		head= insertNodeAtBiginning(204,head);
		head= insertNodeAtBiginning(205,head);
		
		head = insertNodeAtEnd(11, head);
		head = insertNodeAtEnd(12, head);
		head = insertNodeAtEnd(13, head);
		head = insertNodeAtEnd(14, head);

		printLinkedList(head);

	}

	public static void printLinkedList(Node head) {

		System.out.println("Linked List : ");

		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}

		System.out.println("\n=========================");

	}

}
