package addAfter;

public class DoubleLinkedList<T> {

	DoubleNode<T> first;
	
	public DoubleLinkedList<T> addAfter( T elem, T target ){
		boolean encontrado = false;
		DoubleNode<T> act = this.first;
		DoubleNode<T> nuevo = new DoubleNode<T>(elem);
		if( this.first.next.equals(first)) {
			this.first.prev = nuevo;
			this.first.next = nuevo;
		}
		while( !encontrado ) {
			if( act.data.equals(target) ) {
				act.prev.next = nuevo;
				nuevo.prev = act.prev;
				act.prev = nuevo;
				nuevo.next = act;
				encontrado = true;
			}
			act = act.next;
		}
		return this;
	}
}
