package linkedlist;

import linkedlist.LinkedListDemo;

public class LinkedListDeleteANode {

public static Node deleteFromIndex(Node head,int position) {
		
		if(head==null || head.next==null) {
			return null;
		}
		
		int index=0;
		Node copyHead=head;
		while(copyHead.next!=null) {
			if(index+1==position) {
				copyHead.next=copyHead.next.next;
				break;
			}
			copyHead=copyHead.next;
			index++;
		}
		
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
