package addAfter;

public class DoubleNode<T> {
	T data;
	DoubleNode<T> next;
	DoubleNode<T> prev;
	
	public DoubleNode(T dd) {
		data = dd;
		next = null;
		prev = null;
	}
}
