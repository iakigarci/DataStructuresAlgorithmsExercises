package listadeamigos;

public class Nodo {

	Persona info;
	Nodo next;
	
	public Nodo(Persona pInfo) {
		this.info = pInfo;
		this.next = null;
	}
	public Nodo() {
		this.next = null;
	}
}
