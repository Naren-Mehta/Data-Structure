package linkedlist;

import linkedlist.LinkedListDemo;

public class LinkedListFindMiddleValue {

	public static int findMiddleLinkedList(Node head) {

		int value = 0;
		Node slowNode = head;
		Node fastNode = head;
		while (slowNode != null && fastNode != null) {

			if (fastNode.next != null) {
				fastNode = fastNode.next.next;
				slowNode=slowNode.next;
				value = slowNode.value;
			} else {
				break;
			}

		}
		return value;
	}

	public static void main(String[] args) {

		Node head = LinkedListDemo.insertNodeAtEnd(2, null);
		head = LinkedListDemo.insertNodeAtEnd(4, head);
		head = LinkedListDemo.insertNodeAtEnd(6, head);
		head = LinkedListDemo.insertNodeAtEnd(8, head);
		head = LinkedListDemo.insertNodeAtEnd(10, head);
		head = LinkedListDemo.insertNodeAtEnd(11, head);
		head = LinkedListDemo.insertNodeAtEnd(12, head);

		LinkedListDemo.printLinkedList(head);

		System.out.println("Length of linkedlist: " + findMiddleLinkedList(head));

	}

}
