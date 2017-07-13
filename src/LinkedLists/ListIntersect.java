package LinkedLists;
/*
 * Checks if two singly linked lists intersect
 * (at some point merge into same list by reference)
 * Assuming no null lists will be input
 */
public class ListIntersect {

	public static LinkedListNode doesIntersect(LinkedListNode one, LinkedListNode two) {
		//save heads
		LinkedListNode headOne = one;
		LinkedListNode headTwo = two;
		
		//check length of both
		int lenOne = 1;
		int lenTwo = 1;
		while(one.next != null) {
			lenOne++;
			one = one.next;
		}
		while(two.next != null) {
			lenTwo++;
			two = two.next;
		}
		
		//if last node isn't the same, return null
		if(one != two)
			return null;
		//reset heads
		one = headOne;
		two = headTwo;
		
		//check if different lengths, if so trim longer one
		if(lenOne != lenTwo) {
			int diff = 0;
			int longest = 2;
			diff = java.lang.Math.abs(lenOne-lenTwo);
			if(lenOne>lenTwo) {
				longest = 1;
			}
			
			if(longest == 1) {
				for(int i=0; i<diff; i++) {
					one = one.next;
				}
			}else {
				for(int i=0; i<diff; i++) {
					two = two.next;
				}
			}
		}
		
		//now run through both and return first node that is the same
		while(one != two) {
			one = one.next;
			two = two.next;
		}
	
		//doesn't matter which one is returned, both are at same node
		return one;
	}
}
