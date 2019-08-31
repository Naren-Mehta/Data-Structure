package linkedlist;

public class TraverseLinkedListRecursion {

	public static void traverseListViaRecursion(Node head) {

		if (head == null) {
			System.out.println();
			return;
		}
		System.out.print(head.value + " ");
		traverseListViaRecursion(head.next);

	}

	public static void traverseReverseListViaRecursion(Node head) {

		Node node=null;
		
		if (head == null) {
			System.out.println();
			return;
		}
		traverseReverseListViaRecursion(head.next);
		node =head;
		System.out.print(head.value+" ");

	}

	public static void main(String[] args) {

		Node head = LinkedListDemo.createALinkedListWithNodes(10, 20, 30, 40, 50);
		LinkedListDemo.printLinkedList(head);


		traverseListViaRecursion(head);
		System.out.println("\nTraverse Reverse via recursion");

		traverseReverseListViaRecursion(head);

	}
}
