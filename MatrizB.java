package matrizinversa;

public class MatrizB extends DoubleLinkedList<Integer>{

	NodeFila first;
	
	public MatrizB() {
		first = null;
	}
	
	public MatrizB convertir(MatrizA m) {
		NodeFila actB = new NodeFila(m.first.fila);
		Node actA = m.first;   //NODO MATRIZ A
		while( actA!=null) {
			if(actB.fila.equals(actA.fila)) {
				NodeCol recorrer = new NodeCol(actA.columna,actA.data);
				if(first==null) { //PRIMER ELEMENTO DE B
					first = actB;
					actB.right = recorrer;
				}else if(actB.right == null){ //PRIMER ELEMENTO DE UNA LISTA DE COLUMNAS VACIA
					actB.right = recorrer;
				}else { //ANADIR ELEMENTOS A LISTA DE COLUMNAS
					NodeCol actual = actB.right;
					while(actual.next!=null) {
						actual = actual.next;
					}
					actual.next = recorrer;
				}
				actA = actA.next;
			}else { //CREAMOS UNA NUEVA FILA
				NodeFila nuevofila = new NodeFila(actA.fila);
				actB.next = nuevofila;
				actB = actB.next; 
			}
						
		}
		return this;
	}
	
	public void print() {
		NodeFila aux = first;
		while(aux!=null) {
			System.out.println("FILA "+aux.fila);
			if(aux.right!=null) {
				System.out.println("COLUMNA Y DATO "+aux.right.columna+" "+aux.right.data);
			}
			aux = aux.next;
		}
	}
}
