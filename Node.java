package matrizinversa;

public class Node<T> {

	T fila;
	T columna;
	T data;
	Node<T> next;
	
	public Node() {
		next = null;
	}
	
	public Node(T dd,T dF,T dC) {
		fila = dF;
		columna = dC;
		data = dd;
		next = null;
	}
}
