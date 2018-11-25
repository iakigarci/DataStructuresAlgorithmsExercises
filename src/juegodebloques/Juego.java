package juegodebloques;

import java.util.Stack;

public class Juego {

	private Stack<Bloque>[] tablero;
	public static int NUMCOLAS = 7;

	public Juego() {
		tablero = (Stack<Bloque>[]) new Stack[NUMCOLAS];

		for (int i = 0; i<=NUMCOLAS-1; i++) {
			tablero[i] = new Stack<Bloque>();
	 }
	 // código para “llenar” aleatoriamente las pilas de “bloques”
	}
	public int jugar() {
		System.out.println();


		
		
		return puntos;
	} 
	
	
}
