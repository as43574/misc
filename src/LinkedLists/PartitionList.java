package LinkedLists;
/*
 * Move all nodes less than given number to left of that number
 * and move the rest to the right.
 * 
 */
public class PartitionList {
	
	public static LinkedListNode partitionList(LinkedListNode n, int pivot) {
		LinkedListNode lessPointer = null;
		LinkedListNode lessHead = null;
		LinkedListNode greaterPointer = null;
		LinkedListNode greaterHead = null;
		
		while(n != null) {
			LinkedListNode next = n.next;
			n.next = null; // not sure why this was needed; review
			if(n.data < pivot) {
				if(lessHead == null) {
					lessHead = n;
					lessPointer = n;
				}else {
					lessPointer = n;
					lessPointer.next = n;//not sure why not = next
				}
			}else {
				if(greaterHead == null) {
					greaterHead = n;
					greaterPointer = n;
				}else {
					greaterPointer = n;
					greaterPointer.next = n;
				}
			}
			n = next;
		}
		if(lessHead == null)
			return greaterHead;
		
		lessPointer.next = greaterHead; // append greater list to lesser list
		
		return lessHead;
	}
}
