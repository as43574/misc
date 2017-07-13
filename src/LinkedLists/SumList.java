package LinkedLists;
/*
 * From input (2)->(1)->(3), (3)->(2)->(1) (reverse order digits)
 * add the numbers 312 + 123
 * Assuming no null input
 * Book solution used recursion
 */
public class SumList {
	
	public static LinkedListNode sumList(LinkedListNode first, LinkedListNode second) {
		LinkedListNode sum = null;
		LinkedListNode sumHead = sum;
		int tensCarry = 0;
		while(first != null && second != null) {
			int f=0, s=0;
			if(first != null) {
				f = first.data;
				first = first.next;
			}
			if(second != null) {
				s = second.data;
				second = second.next;
			}
			sum.data = ((f+s)%10)+tensCarry;
			if((f+s)>10) {
				tensCarry = 1;
			}else {
				tensCarry = 0;
			}
			sum = sum.next;
		}
		
		return sumHead;
	}
}
