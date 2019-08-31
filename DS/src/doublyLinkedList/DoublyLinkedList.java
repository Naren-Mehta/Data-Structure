package doublyLinkedList;

class Node {
	int data;
	Node next;
	Node prev;

	Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLinkedList {

	public static Node insertIntoDoublyLinkedList(int data, Node head) {

		Node node= new Node(data);
		if(head==null) {
			head=node;
		}else {
			Node headCopy=head;
			while(headCopy.next!=null) {
				headCopy=headCopy.next;
			}
			node.prev=headCopy;
			headCopy.next=node;
		}
		
		return head;
		
	}
	
	public static Node insertIntoHeadInDoublyLinkedList(int data, Node head) {

		Node node= new Node(data);
		if(head==null) {
			head=node;
		}else {
			head.prev=node;
			node.next=head;
		}
		return node;
	}
	
	public static Node createDoublyLinkedList(int... x) {

		Node head=null;
		
		for(int i:x) {
			head=insertIntoDoublyLinkedList(i,head);
		}
		
		return head;
		
	}
	public static Node createDoublyLinkedList2(int... x) {

		Node head=null;
		
		for(int i:x) {
			head=insertIntoHeadInDoublyLinkedList(i,head);
		}
		
		return head;
		
	}
	
	

	public static void main(String[] args) {

//		Node head=createDoublyLinkedList(10,20,30);
		Node head=createDoublyLinkedList2(10,20,30);

		printDoublyLinkedlist(head);
		
	}
	
	public static void printDoublyLinkedlist(Node head) {
		
		System.out.println("==Doubly linked list====");
		Node lastNode=null;
		while(head!=null) {
			System.out.print(head.data+" ");
			if(head.next==null) {
				lastNode=head;
			}
			head=head.next;
			
		}
		
		/*System.out.println("\n\n==Reversed Doubly linked list====");
		
		while(lastNode!=null) {
			System.out.print(lastNode.data+" ");
			lastNode=lastNode.prev;
		}
		*/
		System.out.println();
	}

}
