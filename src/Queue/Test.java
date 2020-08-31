package Queue;

public class Test {

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		for(int i=0;i<5;i++) {
			queue.enque(i);
		}
		
		queue.deque();
		
		// will print 1
		System.out.println(queue.peek());
	
		queue.deque();

		// will print { 2, 3, 4 }
		queue.printQueue();

	}

}
