package linkedlist;

import java.util.HashMap;
import java.util.Map;

public class FIndLoopInLinkedList {

	static Map<Integer, Node> m = new HashMap();

	public static Node createALoopList(int value, Node head) {

		Node node = new Node(value);

		if (head == null) {
			head = node;
		} else {
			Node headCopy = head;
			while (headCopy.next != null) {
				headCopy = headCopy.next;
			}
			headCopy.next = node;
		}
		return head;
	}

/*	public static boolean findLoop(Node head) {

		if(head==null) {
			return false;
		}
		
		Node fastNode = head;
		Node slowNode = head;
		boolean isCircleFound = false;
		while (slowNode != null && fastNode != null && fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;

			if (slowNode.value == fastNode.value) {
				isCircleFound = true;
				break;
			}
		}

		return isCircleFound;
	}*/

	
	public static boolean findLoop(Node head) {
		
		if(head==null) {
			return false;
		}
		
		Node fast=head.next;
		Node slow=head;
		
		while(slow!=fast) {
			if(fast==null || fast.next==null ) {
				return false;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		return true;
		
	}
	public static void main(String[] args) {

		Node head = null;
		head = createALoopList(2, head);
		head = createALoopList(4, head);
		head = createALoopList(6, head);
		head = createALoopList(8, head);
		head = createALoopList(10, head);
		printLinkedList(head);
		
		head.next.next.next.next.next=head.next;

		System.out.println("Check loop");
		System.out.println(findLoop(head));
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
