package com.cwiztech.stackapi;

import java.util.Stack;

public class stackController {
	
	 
	public class StackImpl<E> {
	    private Stack<E> stack;
	 
	    // Constructor to create empty Stack.
	    public StackImpl() { stack = new Stack<E>(); }
	 
	    // method to check if stack is empty or not.
	    public boolean empty() { return stack.empty(); }
	 
	    // method to return topmost element of stack
	    public E peek() { return stack.peek(); }
	 
	    // method to remove and return topmost element of stack
	    public E pop() { return stack.pop(); }
	 
	    // method to push an element into the stack
	    public E push(E item) { return stack.push(item); }
	 
	    // method to return the position of an object
	    // in a stack(1-based position)
	    public int search(Object o) { return stack.search(o); }
	 
	    public void main(String args[])
	    {
	        StackImpl<String> stack = new StackImpl<String>();
	        System.out.println("element pushed : "
	                           + stack.push("one"));
	        System.out.println("element pushed : "
	                           + stack.push("two"));
	        System.out.println("element pushed : "
	                           + stack.push("three"));
	        System.out.println("element pushed : "
	                           + stack.push("four"));
	        System.out.println("element pushed : "
	                           + stack.push("five"));
	        System.out.println("element popped : "
	                           + stack.pop());
	        System.out.println("element popped : "
	                           + stack.pop());
	        System.out.println("Element peek : "
	                           + stack.peek());
	        System.out.println("position of element three - "
	                           + stack.search("three"));
	        while (!stack.empty()) {
	            System.out.println("element popped : "
	                               + stack.pop());
	        }
	    }
	}
}
