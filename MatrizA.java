package matrizinversa;

public class MatrizA extends SimpleLinkedList<Integer>{
	
	Node first;
	
	public MatrizA() {
		Node n1 = new Node(5,2,3);
		Node n2 = new Node(1,2,4);
		Node n3 = new Node(2,3,5);
		Node n4 = new Node(5,4,8);
		
		first = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		
	}
	
	public static void main(String[] args) {
		MatrizA mA = new MatrizA();
		MatrizB mB = new MatrizB();
		MatrizB resultado = mB.convertir(mA);
		resultado.print();
	}
}
