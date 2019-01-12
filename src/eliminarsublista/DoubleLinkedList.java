package eliminarsublista;

public class DoubleLinkedList<T> {

	DoubleNode<T> first;
	
	public DoubleLinkedList(){
		
	}
	
	public void borrarLista(DoubleLinkedList<T> subLista) {
		boolean salir = false;
		DoubleNode<T> act = first.next;
		while( !salir ){
			if( act.data.equals(subLista.first.data) ) { //ACTUAL ES IGUAL AL PRIMERO
				if( act.equals(this.first) ){
					this.first = this.first.next;
				}
				act.prev.next = act.next;
				act.next.prev = act.prev; // LO ELEMINAMOS DE LA LISTA
				subLista = removeFirst(subLista); //LO ELIMINAMOS DE LA SUBLISTA
				if(subLista.first == null) {
					salir = true;
				}
			}
			act = act.next;
		}
	}
	
	public void add( T pElem ) {
		DoubleNode<T> nuevo = new DoubleNode<T>(pElem);
		if(this.first == null) {
			this.first = nuevo;
			nuevo.prev = nuevo;
			nuevo.next = nuevo;
		}else {
			this.first.prev.next = nuevo;
			nuevo.prev = this.first.prev;
			nuevo.next = this.first;
			this.first.prev = nuevo;
		}
	}
	
	public DoubleLinkedList<T> removeFirst(DoubleLinkedList<T> pLista){
		if(pLista.first.next.equals(pLista.first) ) {
			pLista.first = null;
		}else {
			pLista.first.prev.next = pLista.first.next;
			pLista.first.next.prev = pLista.first.prev;
			pLista.first = pLista.first.next;
		}
		return pLista;
	}

	public boolean contains(T elem){
		DoubleNode<T> aux = first;
		boolean enc = false;
		if (aux.data.equals(elem)) return true;
		else{
			aux = aux.next;
			while (aux!=first && !enc){
				if (aux.data.equals(elem)){
					enc = true;
				}else{
					aux = aux.next;
				}
			}
		}

		return enc;
	}
	
	public void insertLast(T elem) {
		if (first == null) {
			DoubleNode node1 = new DoubleNode();
			node1.data = elem;
			node1.next = node1;
			node1.prev = node1;
			first = node1;
		} else {
			DoubleNode node1 = new DoubleNode();
			node1.data = elem;
			node1.next = first;
			node1.prev = first.prev;
			first.prev.next = node1;
			first.prev = node1;
		}
	}

	public void print() {
		if (first == null) {
		} else {
			DoubleNode act = first;
			System.out.print(act.data.toString() + " ");
			act = act.next;
			while (act != first) {
				System.out.print(act.data.toString() + " ");
				act = act.next;
			}
			System.out.println();
		}

	}
}
