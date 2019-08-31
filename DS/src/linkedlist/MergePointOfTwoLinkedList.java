package linkedlist;

public class MergePointOfTwoLinkedList {

	public static int findMergePoint(Node head1, Node head2) {
	
		Node first=head1;
		Node second=head2;
		int mergeValue=-1;
		boolean isMatchFound=false;
		while(first.next!=null) {

			while(second.next!=null) {
				second=second.next;
				first=first.next;

				
				if(first.value==second.value) {
					isMatchFound=true;
					mergeValue=first.value;
//					mergeValue=mergeValue ==-1 ? first.value : mergeValue;
//					second=second.next;
					break;
				}else {
					mergeValue=-1;
					isMatchFound=false;
				}
			}
			
			if(!isMatchFound){
				second=head2;
			}
			
		}
		
		return mergeValue;
	}
	
	
	public static void main(String[] args) {
		
		Node head1= LinkedListDemo.createALinkedListWithNodes(1,2,3);
		Node head2= LinkedListDemo.createALinkedListWithNodes(1,2,3);

		System.out.println(findMergePoint(head1,head2));
		
		
		
	}
	
}
