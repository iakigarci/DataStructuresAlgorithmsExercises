package contextofrase;

public class ListaDePalabras extends DoubleLinkedList<String> {

	public <T> ListaDePalabras obtenerContexto(String pal, Integer n){
		boolean salir = false;
		DoubleNode act = super.first;
		ListaDePalabras resultado = new ListaDePalabras();
		while( !salir ) { //ECONTRAR ELEMENTO
			if( act.data.equals(pal)) {
				salir = true;
			}else {
				act = act.next;
			}
		} //EN ACT TENGO EL ELEMENTO QUE QUIERO
		DoubleNode clave = act;
		for(int cont=0; cont<n;cont++) {
			act = act.prev;
			resultado.add(act.data.toString());
			if(act.prev==null) {
				cont = n;
			}
		}
		int cont2 = 0;
		act = clave;
		salir = false;
		resultado.add(clave.data.toString());
		while(cont2<=n&&!salir){
			if(act.next == null) {
				salir = true;
			}else {
				act = act.next;
				resultado.add(act.data.toString());
				if(act.next==null) {
					salir = true;
				}
			}
		}
		
		return resultado;
	}
	
	public void print() {
		DoubleNode<String> actual = first;
		while( actual != null) {
			System.out.println(actual.data);
			actual = actual.next;
		}
	}
	
	public static void main(String[] args)  {
		ListaDePalabras l = new ListaDePalabras();
		l.add("la");
		l.add("casa");
		l.add("es");
		l.add("bonita");
		
		ListaDePalabras polla = l.obtenerContexto("es", 1);
		polla.print();
		
	}
}
