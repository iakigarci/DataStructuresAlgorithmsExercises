package contextofrase;

public class DoubleNode<T> {

	T data;
	DoubleNode<T> next;
	DoubleNode<T> prev;
	
	public DoubleNode() {
		next = null;
		prev = null;
	}
	
	public DoubleNode(T dd) {
		next = null;
		prev = null;
		this.data = dd;
	}
}
