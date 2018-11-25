package sumadevectores;

public class Vector {

	Node first;
	
	public Vector() {
		first = null;
	}
	
	public void add(Node nodo) {
		if( this.first == null) {
			this.first = nodo;
		}else {
			Node last = this.first;
			while(last.next != null) {
				last = last.next;
			}
			last.next = nodo;
		}
	}
	public Vector suma(Vector v1, Vector v2) {
		//pre:
		//post: el resultado es el vector suma de v1 y v2
		Vector resultado = this;
		Node node1 = v1.first;
		Node node2 = v2.first;
		Node last = this.first;
		boolean salir = false;
		while( !salir ) {
			if(node1 != null && node2 == null) {
				last.next = node1;
				node1 = node1.next;
			}else if(node1 == null && node2 != null) {
				last.next = node2;
				node2 = node2.next;					
			}else if(node1.pos == node2.pos) { //IGUALES
				if(resultado.first.equals(null)) {
					resultado.first = new Node(node1.pos,(node1.data+node2.data));
					last = this.first;
				}else {
					last.next = new Node(node1.pos,(node1.data+node2.data)); 
					last = last.next;
				}
				node1 = node1.next;
				node2 = node2.next;
			}else if(node1.pos > node2.pos) { //V1 MAYOR
				if(resultado.first == null) {
					resultado.first = node2;
					last = this.first;
				}else {
					last.next = node2;
					last = last.next;
				}
				node2 = node2.next;
			}else if((node1.pos < node2.pos) && (node1 != null)) { //V2 MAYOR
				if(resultado.first.equals(null)) {
					resultado.first = node1;
					last = this.first;
				}else {
					last.next = node1;
					last = last.next;
				}
				node1 = node1.next;
			}
			
			if(node1 == null && node2 == null){
				salir = true;
			}
		}
		return resultado;
	}
}
