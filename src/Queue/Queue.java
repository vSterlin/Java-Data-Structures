package Queue;
import LinkedList.LinkedList;

public class Queue<E> {
	private LinkedList<E> queueList = new LinkedList<E>();
	public void enque(E data) {
		queueList.addToRear(data);
	}
	public void deque() {
		queueList.deleteFront();
	}
	
	public E peek() {
		return queueList.getFront();
	}
	public boolean isEmpty() {
		return queueList.isEmpty();
	}
	public void printQueue() {
		queueList.printList();
	} 
}
