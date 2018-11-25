package robot;

import java.util.ArrayList;

public class Camino {
	static Node first;
	
	public Camino() {
		Node node1 = new Node("3-9-5");
		Node node2 = new Node("2-4-5");
		Node node3 = new Node("9-8-4");
		Node node4 = new Node("9-5-9");
		Node node5 = new Node("1-5-7");
		Node node6 = new Node("8-5-9");
		Node node7 = new Node("1-5-9");
		Node node8 = new Node("5-9-3");
		Node node9 = new Node("1-2-7");

		first = node1;
		node1.left = node2;
		node1.next = node3;
		
		node2.next = node4;
		node2.right = node5;
		
		node3.next = node5;
		
		node4.next = node6;
		
		node5.next = node7;
		node5.left = node6;
		
		node6.next = node8;
		
		node7.left = node8;
		node7.next = node9;
	}
	
	public static CircularLinkedList<String> obtCoordenadas(ArrayList<String> acciones){
		Node act = first;
		String movAct = null;
		CircularLinkedList<String> coordenadas = new CircularLinkedList<String>();
		coordenadas.add(act.coord);
		for(int i=0; i<acciones.size();i++) {
			movAct = acciones.get(i);
			switch (movAct) {
				case "izquierda":
					act = act.left;
					coordenadas.add(act.coord);
					break;
				case "derecha":
					act = act.right;
					coordenadas.add(act.coord);
					break;
				case "adelante":
					act = act.next;
					coordenadas.add(act.coord);
					break;
			}	
		}
		return coordenadas;
	}
	
	public static void main(String[] args) {
		ArrayList<String> acciones = new ArrayList<String>();
		acciones.add("izquierda");
		acciones.add("derecha");
		acciones.add("adelante");
		acciones.add("izquierda");
		
		System.out.println("Esta es la lista de acciones: "+acciones);
		Camino camino = new Camino();
		CircularLinkedList<String> coordenadas = camino.obtCoordenadas(acciones);
		NodeCircularLinkedList act = coordenadas.last.next;
		while( !act.equals(coordenadas.last) ) {
			System.out.println(act.data);
			act = act.next;
		}
		System.out.println(coordenadas.last.data);
		
	}
}
