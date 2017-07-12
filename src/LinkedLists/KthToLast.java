package LinkedLists;
/*
 * Prints the kth to last element in a linked list
 * Assumptions: not given length, and k=0 is tail node
 * Alternate solution: count length in loop first
 * then move to correct element.
 */
public class KthToLast {

	public static void main(String[] args) {
		LinkedListNode node = new LinkedListNode(1);
		LinkedListNode head = node;
		for(int i=2; i<10; i++) {
			LinkedListNode n = new LinkedListNode(i);
			node.setNext(n);
			node = n;
		}
		printKthToLast(head, 3); //should print 7
	}
	// Assuming that k will never be larger than list length
	public static void printKthToLast(LinkedListNode head, int k) {
		LinkedListNode end = head; //this one will create the buffer of k spaces
		LinkedListNode kth = head; //this will end up on kth space from end
		
		for(int i=0; i<k; i++) {
			end = end.next;
		}
		while(end != null) {
			end = end.next;
			kth = kth.next;
		}
		System.out.println("The kth node's data is "+kth.data);
	}
}
