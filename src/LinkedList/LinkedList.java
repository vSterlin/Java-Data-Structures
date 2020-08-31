package LinkedList;

public class LinkedList {
  private Node head;
  private Node tail;
  private int size = 0;
  
  
  
  public int getSize() {
	  return this.size;
  }
  // helper to check if list is empty
  public boolean isEmpty(){
    if(this.size == 0) return true;
    return false;
  }
  
  // gets called if list has no elements
   private void addToEmptyList(int data) {
     Node nodeToAdd = new Node();
     nodeToAdd.setData(data);
     this.head = nodeToAdd;
     this.tail = nodeToAdd;
   }

   // creates new node, sets head to point to this node
   void addToFront(final int data){
     if(isEmpty()==true) addToEmptyList(data);
     else {
    	 Node nodeToAdd = new Node();
    	 nodeToAdd.setData(data);
    	 this.head.setPrev(nodeToAdd);
    	 nodeToAdd.setNext(this.head);
    	 this.head = nodeToAdd;
     }
     this.size++;
   }
   
   // creates new node, sets tail to point to this node
   void addToRear(final int data){
     if(isEmpty()==true) addToEmptyList(data);
     else {
    	 Node nodeToAdd = new Node();
    	 nodeToAdd.setData(data);
    	 this.tail.setNext(nodeToAdd);
    	 nodeToAdd.setPrev(this.tail);
    	 this.tail = nodeToAdd;
     }
     this.size++;
   }
   
   // inserts a new node at the index
   void addAtIndex(int index, final int data) {
	   if(index <= 0) addToFront(data);
	   else if(index >= this.size) addToRear(data);
	   else {
	   Node current = this.head;
	   Node nodeToAdd = new Node();
	   nodeToAdd.setData(data);
	   for(int i = 0;i< index; i++) {
		   current = current.getNext();
	   }
	   nodeToAdd.setPrev(current.getPrev());
	   nodeToAdd.setNext(current);
	   current.getPrev().setNext(nodeToAdd);
	   current.setPrev(nodeToAdd);
	   size++;
	   }
   }
   
   // deletes first item
   void deleteFront() {
	   this.head = this.head.getNext();
	   this.head.setPrev(null);
	   this.size--;
   }
   
   //deletes last item
   void deleteRear() {
	   this.tail = this.tail.getPrev();
	   this.tail.setNext(null);
	   this.size--;
   }
   
   // deletes a node at index
   void deleteAtIndex(int index) {
	   if(index <= 0) deleteFront();
	   else if(index >= this.size) deleteRear();
	   else {
		   Node current = this.head;
		   for(int i = 0;i< index; i++) {
			   current = current.getNext();
		   }
		   current.getPrev().setNext(current.getNext());
		   current.getNext().setPrev(current.getPrev());
		   this.size--;
	   }
   }
   
   
  void printList(){
    Node current = head;
    String output = "{ ";
    while(current != null){
      output += current.getData() + ", ";
      current = current.getNext();
    }
    // remove last ", "
    output = output.substring(0, output.length() - 2);
    output += " }";
    System.out.println(output);
  }
}