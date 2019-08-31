package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class MergePointOfTwoLinkedListWithSet {

	public static int findMergePoint(Node head1, Node head2) {
	
		Node first=head1;
		Node second=head2;
		int mergePoint=-1; 

		Set<Integer> s= new HashSet<Integer>();
		while(second.next!=null) {
			s.add(second.next.value);
			second=second.next;
		}
		
		while(first.next!=null) {
			if(s.contains(first.next.value)) {
				mergePoint=first.next.value;
				break;
			}
		}
		
		return mergePoint;
	}
	
	
	public static void main(String[] args) {
		
		Node head1= LinkedListDemo.createALinkedListWithNodes(1,2,3);
		Node head2= LinkedListDemo.createALinkedListWithNodes(1,2,3);

		System.out.println(findMergePoint(head1,head2));
		
		
		
	}
	
}
