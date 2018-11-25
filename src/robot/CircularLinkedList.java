package robot;

public class CircularLinkedList<T> {

	//LISTA CIRCULAR CON ENLACE AL ULTIMO ELEMENTO
	NodeCircularLinkedList<T> last;
	public CircularLinkedList() {
		last = null;
	}
	
	public void add(String coord) {
		NodeCircularLinkedList<T> nuevo = new NodeCircularLinkedList(coord);
		if(last == null) {
			last = nuevo;
			last.next = nuevo;
		}else if(last.next.equals(last)) {
			nuevo.next = last;
			last.next = nuevo;
			last = nuevo;
		}else {
			nuevo.next = last.next;
			last.next = nuevo;
			last = nuevo;
		}
	}
}
