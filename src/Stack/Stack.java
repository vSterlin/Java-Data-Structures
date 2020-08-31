package Stack;
import LinkedList.LinkedList;

public class Stack<E>{
	private LinkedList<E> stackList = new LinkedList<E>();
	
	public void push(E data) {
		stackList.addToFront(data);
	}
	public void pop() {
		stackList.deleteFront();
	}
	public E peek() {
		return stackList.getFront();
	}
	public boolean isEmpty() {
		return stackList.isEmpty();
	}
	public void printStack() {
		stackList.printList();
	}
}
