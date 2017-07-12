package LinkedLists;

import java.util.HashSet;

/*
 * Given starting node, remove duplicate nodes from linked list
 * RETURN TO THIS PROBLEM: needed too much help from book
 */
public class removeDups {
	
	public static void removeDuplicates(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode prev = null;
		while(n != null) {
			if(set.contains(n.data)) {
				prev.next = n.next;
			}else {
				set.add(n.data);
				prev = n;
			}
			n = n.next;
		}
	}
}
