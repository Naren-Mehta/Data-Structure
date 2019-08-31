package linkedlist;

import linkedlist.LinkedListDemo;

public class LinkedListDeleteANodeFromStart {

public static Node deleteFromIndex(Node head,int position) {
		
		if(head==null || head.next==null) {
			return null;
		}
		
		head=head.next;
		
		return head;
	}

	public static void main(String[] args) {

		Node head = LinkedListDemo.insertNodeAtEnd(2, null);
		head = LinkedListDemo.insertNodeAtEnd(4, head);
		head = LinkedListDemo.insertNodeAtEnd(6, head);
		head = LinkedListDemo.insertNodeAtEnd(8, head);
		head = LinkedListDemo.insertNodeAtEnd(10, head);

		LinkedListDemo.printLinkedList(head);
		head=deleteFromIndex(head, 1);
		LinkedListDemo.printLinkedList(head);

	}

	

}
