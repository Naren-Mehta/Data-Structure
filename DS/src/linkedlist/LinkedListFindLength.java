package linkedlist;

import linkedlist.LinkedListDemo;

public class LinkedListFindLength {

	
	public static int findLinkedListLength(Node head) {
		
		int length=0;
		while(head!=null) {
			length++;
			head=head.next;
		}
		return length;
	}
	
	

	public static void main(String[] args) {

		Node head = LinkedListDemo.insertNodeAtEnd(2, null);
		head = LinkedListDemo.insertNodeAtEnd(4, head);
		head = LinkedListDemo.insertNodeAtEnd(6, head);
		head = LinkedListDemo.insertNodeAtEnd(8, head);
		head = LinkedListDemo.insertNodeAtEnd(10, head);
		head = LinkedListDemo.insertNodeAtEnd(11, head);

		LinkedListDemo.printLinkedList(head);
		
		System.out.println("Length of linkedlist: "+findLinkedListLength(head));



	}

	

}
