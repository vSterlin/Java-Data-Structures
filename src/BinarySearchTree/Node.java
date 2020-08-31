package BinarySearchTree;

public class Node {
  private int data;
  private Node left = null;
  private Node right = null;

  public int getData() {
    return this.data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getLeft() {
    return this.left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return this.right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

}
