package matrizinversa;

public class NodeFila<T> {

	T fila;
	NodeFila<T> next;
	NodeCol<T> right;
	
	public NodeFila() {
		next = null;
		right = null;
	}
	
	public NodeFila(T dFila) {
		next = null;
		right = null;
		fila = dFila;
	}
}
