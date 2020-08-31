package Stack;
import LinkedList.LinkedList;

public class Stack {
	private LinkedList stackList = new LinkedList();
	
	public void push(int data) {
		stackList.addToFront(data);
	}
	public void pop() {
		stackList.deleteFront();
	}
	public int peek() {
		return stackList.getFront();
	}
	public boolean isEmpty() {
		return stackList.isEmpty();
	}
	public void printStack() {
		stackList.printList();
	}
}
