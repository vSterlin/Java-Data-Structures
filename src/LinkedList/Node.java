package LinkedList;

public class Node<E> {
  private E data;
  private Node<E> next = null;
  private Node<E> prev = null;

  public E getData() {
    return this.data;
  }

  public void setData(E data) {
    this.data = data;
  }

  public Node<E> getNext() {
    return this.next;
  }

  public void setNext(Node<E> next) {
    this.next = next;
  }

  public Node<E> getPrev() {
    return this.prev;
  }

  public void setPrev(Node<E> prev) {
    this.prev = prev;
  }
  
}
