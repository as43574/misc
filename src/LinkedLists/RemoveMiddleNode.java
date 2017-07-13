package LinkedLists;
/*
 * Removes a node that isn't head or tail.
 * Assuming that user won't input a node that is head or tail.
 * 
 */
public class RemoveMiddleNode {
	// ...this problem was silly.
	public static void removeMiddleNode(LinkedListNode node) {
		LinkedListNode nextNode = node.next;
		node.data = nextNode.data;
		node.next = nextNode.next;
	}
}
