package BinarySearchTree;

public class Test {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(1);
		bst.insert(0);

		bst.insert(10);
		bst.insert(-1);
		
		System.out.println(bst.getSize());
		bst.printLeft();
	}

}
