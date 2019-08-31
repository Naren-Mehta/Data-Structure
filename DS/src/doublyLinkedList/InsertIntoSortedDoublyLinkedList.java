package doublyLinkedList;


public class InsertIntoSortedDoublyLinkedList {

	public static Node insertIntoSortedDoublyLinkedList(int data, Node head) {
		
		Node node = new Node(data);
		if(head==null) {
			head=node;
		}else if(head.data > data) {
			node.next=head;
			node.next.prev=node;
			head=node;
		}else {
			Node current=head;
			while(current.next!=null && current.next.data <node.data) {
				current=current.next;
			}
			
			System.out.println(current.data);
			node.next=current.next;
			
			if(current.next!=null) {
				node.next.prev=node;
			}
			
			current.next=node;
			node.prev=current;
			
		}
		
		return head;
		

	}

	public static void main(String[] args) {

		Node head=DoublyLinkedList.createDoublyLinkedList(10,20,30);
		
		DoublyLinkedList.printDoublyLinkedlist(head);

		head=insertIntoSortedDoublyLinkedList(5,head);
		head=insertIntoSortedDoublyLinkedList(4,head);
		head=insertIntoSortedDoublyLinkedList(22,head);
//		head=insertIntoSortedDoublyLinkedList(40,head);

		DoublyLinkedList.printDoublyLinkedlist(head);

	}
	

}
