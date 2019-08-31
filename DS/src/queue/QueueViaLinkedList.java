package queue;

class Node {
	int data;
	Node next;

	Node(int x) {
		this.data = x;
		this.next = null;
	}
}

public class QueueViaLinkedList {

	Node front = null;
	Node rear = null;

	public void enqueue(int x) {
		Node node = new Node(x);
		if (isEmpty()) {
			front = rear = node;
		} else {
			Node frontCopy = front;
			while (frontCopy.next != null) {
				frontCopy = frontCopy.next;
			}
			frontCopy.next = node;
			rear = node;
		}
	}

	public boolean isEmpty() {
		return front == rear && rear == null;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is already empty");
			return;
		} else if (front == rear) {
			System.out.println("==if else==");
			front = rear=null;
		} else {
			System.out.println("==else==");
			front = front.next;
		}
	}

	public static void main(String[] args) {
		QueueViaLinkedList q = new QueueViaLinkedList();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		printLinkedListQueue(q.front);

		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.enqueue(40);
		printLinkedListQueue(q.front);

	}

	public static void printLinkedListQueue(Node head) {
		Node headCopy = head;

		while (headCopy != null) {
			System.out.print(headCopy.data + " ");
			headCopy = headCopy.next;
		}
		System.out.println();
	}

}
