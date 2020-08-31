package Queue;
import LinkedList.LinkedList;

public class Queue {
	private LinkedList queueList = new LinkedList();
	public void enque(int data) {
		queueList.addToRear(data);
	}
	public void deque() {
		queueList.deleteFront();
	}
	
	public int peek() {
		return queueList.getFront();
	}
	public boolean isEmpty() {
		return queueList.isEmpty();
	}
	public void printQueue() {
		queueList.printList();
	} 
}
