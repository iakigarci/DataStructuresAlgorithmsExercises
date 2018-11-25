package matrizinversa;

public class NodeCol<T> {

	T data;
	T columna;
	NodeCol<T> next;
	
	public NodeCol() {
		next = null;
	}
	
	public NodeCol(T columna, T dd) {
		this.data = dd;
		this.columna = columna;
		next = null;
	}
}
