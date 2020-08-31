package BinarySearchTree;

public class BinarySearchTree {
  
	private Node root = null;
	
	public boolean isEmpty() {
		if(root == null) return true;
		return false;
	}
	public void insert(int data){
		Node nodeToInsert = new Node();
		nodeToInsert.setData(data);
		if(isEmpty() == true) {
			this.root = new Node();
			this.root.setData(data);
		}
		else {
			Node current = this.root;
			// go left
			while(current != null) {
				if(data < current.getData()) {
					current = current.getLeft();
					
					System.out.println("Went left");
				}
				else {
					current = current.getRight();
					System.out.println("Went right");
				}
				
			}
			current = nodeToInsert;

		}
	}
}
