package stack;

class StackDemo {
	int[] arr = new int[5];
	int top = -1;
}

public class StackExample {

	int[] arr = new int[5];
	int top = -1;
	
	public void push(int data) {
		top++;
		arr[top]=data;
	}

	public void pop() {
		top--;
	}
	
	public int top() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top==-1 ?true:false;
	}

	public static void main(String[] args) {

		StackExample s= new StackExample();
		s.push(2);
		s.push(4);
		s.push(6);
		//s.pop();
		for(int i=0;i<=s.top;i++) {
			System.out.println(s.arr[i]);
		}
		
		System.out.println("Top: "+s.top());
		System.out.println("IsEmpty: "+s.isEmpty());

		
		
	}
}
