package queue;

public class CircularArrayQueueDemo {

	int[] arr = new int[5];
	int front = -1;
	int rear = -1;
	int length = arr.length;

	public boolean isFull() {
		return (rear+1)%length==front;

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
			rear = (rear + 1)%length;
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
		CircularArrayQueueDemo q = new CircularArrayQueueDemo();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		q.dequeue();
		q.enqueue(60);
		q.enqueue(70);
		q.enqueue(80);

		printQueue(q.arr);

		
		
	}

	public static void printQueue(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
