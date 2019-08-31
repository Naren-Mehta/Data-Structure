package stack;

import java.util.Stack;

import linkedlist.LinkedListDemo;
import linkedlist.Node;;

public class ReverseLinkedList {
public static void main(String[] args) {
	
	Node head=LinkedListDemo.createALinkedListWithNodes(10,20,30,40);
	LinkedListDemo.printLinkedList(head);
	
	Stack s =new Stack();
	
	Node current=head;
	while(current.next!=null) {
		s.add(current);
		current=current.next;
	}
	
	
	head=current;
	
	System.out.println(current.value);
	
	while(!s.isEmpty()) {
		current.next=(Node) s.peek();
		current=current.next;
		s.pop();
	}
    current.next = null;  
	
	
	LinkedListDemo.printLinkedList(head);

}
}
