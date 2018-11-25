package eliminarsublista;

public class pruebaDoubleCircular {

	public static <T> void main(String[] args)  {
		// TODO Auto-generated method stub

		DoubleLinkedList<Persona> l = new DoubleLinkedList<Persona>();
		l.add(new Persona("ana","1111"));
		l.add(new Persona("jon","2222"));
		l.add(new Persona("amaia","3333"));
		l.add(new Persona("luis","4444"));
		l.add(new Persona("ander","5555"));
		visualizar(l);
		
		DoubleLinkedList<Persona> l2 = new DoubleLinkedList<Persona>();
		l2.add(new Persona("ana","1111"));
		l2.add(new Persona("jon","2222"));
		l2.add(new Persona("amaia","3333"));
		l2.add(new Persona("luis","4444"));
		visualizar(l2);

		
		l.borrarLista(l2);
		visualizar(l);
		System.out.println("POLLA");
	}
	
	public static <T> void visualizar(DoubleLinkedList<T> l) {
		System.out.println(l.first.data);
		System.out.println(l.first.prev.data);
	}

}
