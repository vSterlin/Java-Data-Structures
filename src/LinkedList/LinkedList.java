package LinkedList;

public class LinkedList {
  private Node head;
  private Node tail;
  private int size = 0;
  
  
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