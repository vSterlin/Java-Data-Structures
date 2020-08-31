package BinarySearchTree;

public class BinarySearchTree {
  
	private Node root = null;
	private int size = 0;
	
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
			Node parent = null;
			Node current = this.root;
			while(current != null) {
				
				// go left
				if(data < current.getData()) {
					parent = current;
					current = current.getLeft();
				}
				
				// go right
				else {
					parent = current;
					current = current.getRight();
				}
				
			}
			if(data < parent.getData()) parent.setLeft(nodeToInsert);
			
			else parent.setRight(nodeToInsert);

		}
		this.size++;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void printLeft() {
		Node current = this.root;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getLeft();
		}
	}
	
	public void printRight() {
		Node current = this.root;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getRight();
		}
	}
}
