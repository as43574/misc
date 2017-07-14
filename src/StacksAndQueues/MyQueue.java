package StacksAndQueues;

import java.util.Stack;

/*
 * Implement a queue using two stacks.
 * 
 * Idea here being, use one stack to reverse the order of the other.
 */
public class MyQueue<T> {
	Stack<T> older, newer;
	
	public MyQueue() {
		older = new Stack<T>();
		newer = new Stack<T>();
	}
	
	public void add(T item) {
		newer.push(item);
	}
	
	public void shiftStacks(){
		if(older.isEmpty()) {
			while(!newer.isEmpty()) {
				older.push(newer.pop());
			}
		}
	}
	public T remove() {
		shiftStacks();
		return older.pop();
	}
	
	public T peek(){
		shiftStacks();
		return older.peek();
	}
}
