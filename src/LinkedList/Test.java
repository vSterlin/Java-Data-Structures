package LinkedList;

public class Test {

	public static void main(String[] args) {

	
		LinkedList l = new LinkedList();
		// outputs true
		System.out.println(l.isEmpty());
		l.addToRear(1);
		l.addToRear(2);
		l.addToRear(3);
		
		// outputs { 1, 2, 3 }
		l.printList();

		l.addToFront(4);
		l.addToFront(5);
		l.addToFront(6);
		
		// outputs { 6, 5, 4, 1, 2, 3 }
		l.printList();

		// outputs false
		System.out.println(l.isEmpty());


	}

}
