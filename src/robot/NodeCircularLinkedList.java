package robot;

public class NodeCircularLinkedList<T> {

	T data;
	NodeCircularLinkedList<T> next;
	
	public NodeCircularLinkedList(T dd) {
		this.data = dd;
		next = null;
	}
}
