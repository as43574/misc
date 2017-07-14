package StacksAndQueues;
/*
 * Use a single array to implement three stacks.
 * REVISIT THIS PROBLEM
 */
public class ThreeInOne {
	private int stackSize;
	private int[] values;
	private int[] sizes = new int[3];//book takes the three and makes it separate var
	
	public ThreeInOne(int size) {
		stackSize = size;
		values = new int[stackSize*3];
	}
	
	public void push(int data, int stackNumber) {
		if(isFull(stackNumber))
			//throw new FullStackException(); //FullStackException dosn't exist yet
		sizes[stackNumber]++;
		values[stackSize*stackNumber + sizes[stackNumber] - 1] = data;
	}
	
	public int pop(int stackNumber) {
		if(isEmpty(stackNumber)) {
			//throw new EmptyStackException(); //EmptyStackException doesn't exist yet
		}
		int index = stackSize*stackNumber + sizes[stackNumber] -1;
		int result = values[index];
		values[index] = 0;
		sizes[stackNumber]--;
		return result;
	}
	
	public int peek(int stackNumber){
		if(isEmpty(stackNumber))
			return -1;
		return values[stackSize*stackNumber + sizes[stackNumber] -1];
	}
	public boolean isEmpty(int stackNumber) {
		return sizes[stackNumber] == 0;
	}
	
	public boolean isFull(int stackNumber) {
		return sizes[stackNumber] == stackSize;
	}
	
}
