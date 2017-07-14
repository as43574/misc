package LinkedLists;

import java.util.HashSet;

/*
 * Given a linked list with a loop in it
 * returns the first node in the loop
 * i.e. a->b->c->d->c
 * where c would be the start
 * 
 */
public class LoopDetection {
	/* My solution is to add every node to a hashset until a duplicate is found.
	* this is not optimal for space, but very fast and simple.
	* The idea being that the first node to be found in the set is the beginning
	* of the loop.
	* Book solution used two pointers, one fast one slow and waited for collision,
	* then did some calculations to find loop start.
	*/
	public static LinkedListNode detectLoop(LinkedListNode n) {
		HashSet<LinkedListNode> check = new HashSet<LinkedListNode>();
		while(n != null) {
			if(check.contains(n)) {
				return n;
			}
			check.add(n);
			n = n.next;
		}
		return null;
	}
}
