package queue;

public class QueueDemo {

	int[] arr = new int[5];
	int front = -1;
	int rear = -1;
	int length = arr.length;

	public boolean isFull() {
		return rear == length - 1 ? true : false;

	}

	public boolean isEmpty() {
		return front == rear && front == -1;
	}

	public void enqueue(int x) {

		if (isEmpty()) {
			rear = front = 0;
		} else if (isFull()) {
			System.out.println("Queue is full. Cannot insert value: "+x);
			return;
		} else {
			rear = rear + 1;
		}

		arr[rear] = x;

	}

	public void dequeue() {
		
		if(isEmpty()) {
			System.out.println("Que is empty.");
		}else {
			front=front+1;
		}

	}

	public static void main(String[] args) {
		QueueDemo q = new QueueDemo();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		printQueue(q.arr);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(50);

	}

	public static void printQueue(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
