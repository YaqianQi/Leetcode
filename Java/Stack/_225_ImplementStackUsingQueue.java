import java.util.*;
public class _225_ImplementStackUsingQueue {
	
	Queue<Integer> queue;
	
		public _225_ImplementStackUsingQueue() {
			queue = new LinkedList<Integer>();
	    }
	    
	    /** Push element x onto stack. */
	    public void push(int x) {
	        queue.add(x);
	        queue.add(queue.poll());
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() {
	    	return queue.poll();
	        
	    }
	    
	    /** Get the top element. */
	    public int top() {
	    	return queue.peek();
	        
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	    	return queue.isEmpty();
	        
	    }
	    
	    public static void main(String[] args) {
	    	
	    	_225_ImplementStackUsingQueue isq = new _225_ImplementStackUsingQueue();
	    	isq.push(1);
	    	isq.push(2);
	    	isq.push(3);
	    	
	    	System.out.println(isq.pop());
	    	
	    }
}
