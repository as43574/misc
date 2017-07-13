package LinkedLists;
/*
 * Checks if list is an integer palendrome
 * i.e. 1, 2, 3, 4, 3, 2, 1
 * My solution was very close to the books.
 * The book split the reversal and equal check into two methods making it
 * easier to refactor.
 */
public class PalendromeListCheck {

	public static boolean isPalendrome(LinkedListNode n) {
		if(n == null)
			return false;
		if(n.next == null) //one element list
			return true;
		
		LinkedListNode reverse = null; //reversed list
		LinkedListNode copy = n; //copy for iteration
		LinkedListNode temp = null;
		while(copy != null) {
			temp = copy; //save node
			temp.next = reverse; //append reversed list to node
			reverse = temp; //save new reversed list
			copy = copy.next; //go to next node
		}
		while(n != null) {
			if(n.data != reverse.data)
				return false;
			n = n.next;
			reverse = reverse.next;
		}
		
		return true;
	}
}
