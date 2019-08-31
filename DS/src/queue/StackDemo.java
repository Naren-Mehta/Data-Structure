package queue;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	
	Stack s  = new Stack();
	Stack sR= new Stack();
	s.push(10);
	s.push(20);

	System.out.println(s);
	
	while(!s.isEmpty()){
		sR.push(s.pop());
	}

	System.out.println("sr "+sR);
	System.out.println(sR.peek());

	while(!sR.isEmpty()){
		s.push(sR.pop());
	}
	
	System.out.println("sr "+sR);
	System.out.println("s "+s);
}
}
