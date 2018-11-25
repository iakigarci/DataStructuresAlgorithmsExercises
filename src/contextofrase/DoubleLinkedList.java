package contextofrase;

public class DoubleLinkedList<T> {

	DoubleNode<T> first;
	
	public DoubleLinkedList() {
		first = null;
	}
	
	public void add(T elem) {
		DoubleNode<T> nuevo = new DoubleNode<T>(elem);
		if( first == null ) {
			first = nuevo;
		}else {
			boolean salir = false;
			DoubleNode<T> act = first;
			while( !salir ) {
				if( act.next == null ) {
					act.next = nuevo;
					nuevo.prev = act;
					salir = true;
				}else {
					act = act.next;
				}
			}
		}
	}
}
