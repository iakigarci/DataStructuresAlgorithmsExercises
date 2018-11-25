package sumadevectores;

public class PruebaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		v1.add(new Node(4,7));
		v1.add(new Node(7,12));
		v1.add(new Node(9,3));
		
		Vector v2 = new Vector();
		v2.add(new Node(2,4));
		v2.add(new Node(4,7));
		v2.add(new Node(7,3));
		
		Vector resultado = new Vector();
		resultado.suma(v1, v2);
		System.out.println(resultado.first.data);
		System.out.println(resultado.first.next.next.next.data);
		
		
	}

}
