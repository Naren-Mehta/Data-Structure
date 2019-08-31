package linkedlist;

import linkedlist.LinkedListDemo;

public class LinkedListDeleteMiddleValue {

	public static Node deleteMiddleLinkedList(Node head) {

		int value = 0;
		Node slowNode = head;
		Node fastNode = head;
		Node previous=null;
		while (slowNode != null) {

			if (fastNode !=null && fastNode.next != null) {
				fastNode = fastNode.next.next;
				previous=slowNode;
				slowNode=slowNode.next;
			} else {
				previous.next=slowNode.next;
				break;
			}

		}
		return head;
	}

	public static void main(String[] args) {

		Node head= LinkedListDemo.createALinkedListWithNodes(10,20,30,40,50);

		LinkedListDemo.printLinkedList(head);

		head=deleteMiddleLinkedList(head);
		
		LinkedListDemo.printLinkedList(head);


	}

}
