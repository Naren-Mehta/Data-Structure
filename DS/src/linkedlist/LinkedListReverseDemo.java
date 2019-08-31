package linkedlist;

import linkedlist.LinkedListDemo;

public class LinkedListReverseDemo {

	
	public static Node reverseLinkedList(Node head) {
		
		
		Node currentNode=head;
		Node nextNode=null;
		Node previousNode=null;
		while(currentNode!=null) {
			nextNode=currentNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		head=previousNode;
		return head;
	}
	

	public static void main(String[] args) {

		Node head = LinkedListDemo.insertNodeAtEnd(2, null);
		head = LinkedListDemo.insertNodeAtEnd(4, head);
		head = LinkedListDemo.insertNodeAtEnd(6, head);
		head = LinkedListDemo.insertNodeAtEnd(8, head);
		head = LinkedListDemo.insertNodeAtEnd(10, head);
		head = LinkedListDemo.insertNodeAtEnd(11, head);

		LinkedListDemo.printLinkedList(head);
		
		head= reverseLinkedList(head);
		System.out.println("==welcome");
		LinkedListDemo.printLinkedList(head);



	}

	

}
