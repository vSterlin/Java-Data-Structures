package LinkedList;

public class Test {

	public static void main(String[] args) {

	
		LinkedList<Integer> l = new LinkedList<Integer>();
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

		// will delete first item if index is less or equal 0
		l.deleteAtIndex(-1);
		
		// will delete first item if index is more or equal to size of list
		l.deleteAtIndex(100);

		// outputs { 5, 4, 1, 2 }
		l.printList();

	}

}
