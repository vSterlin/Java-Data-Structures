package Stack;

public class Test {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		for(int i=0;i<5;i++) {
			stack.push(i);
		}
		
		stack.pop();
		
		// will print 3
		System.out.println(stack.peek());
		
		stack.pop();

		// will print { 2, 1, 0 } 
		stack.printStack();
	}

}
