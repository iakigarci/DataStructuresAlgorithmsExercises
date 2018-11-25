package robot;

public class Node {

	String coord;
	Node next;
	Node left;
	Node right;
	
	public Node(String cord) {
		this.coord = cord;
		this.next = null;
		this.left = null;
		this.right = null;
	}
	
	public Node() {
		this.next = null;
		this.left = null;
		this.right = null;
	}
}
