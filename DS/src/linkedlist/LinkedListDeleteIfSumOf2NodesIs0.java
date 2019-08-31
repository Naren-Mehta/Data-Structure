package linkedlist;

import linkedlist.LinkedListDemo;

public class LinkedListDeleteIfSumOf2NodesIs0 {

	public static Node deleteIfSumOf2NodeIs0LinkedList(Node head) {

		Node firstHead = head;
		Node secondHead = head;
		
		Node previousFirstHead=null;
		Node previousSecondHead=null;

		
		while(firstHead!=null && secondHead!=null) {
			secondHead=secondHead.next;
			while (secondHead!=null) {
				int sum=firstHead.value + secondHead.value;
				if(sum==0) {
					
				}
			}
		}

		return head;
	}

	public static void main(String[] args) {

		Node head = LinkedListDemo.createALinkedListWithNodes(10, 20, 30, 40, 50);

		LinkedListDemo.printLinkedList(head);

		head = deleteIfSumOf2NodeIs0LinkedList(head);

		LinkedListDemo.printLinkedList(head);

	}

}
