package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class MergePointOfTwoLinkedListWithBestResult {

	public static int length(Node head) {
		int length=0;
		while(head!=null) {
			length++;
			head=head.next;
		}
		return length;
	}
	
	public static int findMergePoint(Node head1, Node head2) {
	
		
		System.out.println(head1);
		System.out.println(head2);

		int x=10;
		
		return x;
		
	}
	
	
	public static void main(String[] args) {
		
		Node head1= LinkedListDemo.createALinkedListWithNodes(1,2,3);
		Node head2= LinkedListDemo.createALinkedListWithNodes(1,2,3);

		System.out.println(findMergePoint(head1,head2));
		
		
		
	}
	
}
