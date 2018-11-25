package colores;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Juego {

	Queue<Integer>[] jugadores;
	// Los colores de las fichas se representan por enteros ,donde las fichas
	// negras vienen dadas por el 0, y el resto de jugadores tendrán el color
	// correspondiente a la posición del jugador (es decir, el jugador 1 tendrá
	// fichas de valor 1, ...)
	Stack<Integer> mesa;
	int NUMJUGADORES = 6;

	public int juego(int n, ArrayList<Tirada> tiradas) {
		// pre: n es el número de fichas inicial de cada jugador
		// “tiradas” tiene los valores de los dados durante una partida
		// post: el resultado es el número del jugador ganador
		jugadores = new LinkedList[NUMJUGADORES];
		for (int i = 0; i < jugadores.length; i++) 
			jugadores[i] = new LinkedList<Integer>();
		for (int i = 0; i < jugadores.length; i++)
			for (int j = 1; j <= n; j++)
				jugadores[i].add(i);

		mesa = new Stack<Integer>();

		// JUGAR
		// COMPLETAR
		Tirada tActual = new Tirada();
		int ficha = 1;
		
		for (int i = 0; i<tiradas.size(); i++) {
			tActual = tiradas.get(i);
			int dado1 = tActual.getDado1();
			int dado2 = tActual.getDado2()-1;
			if (dado1==6) {
				i = tiradas.size();
			}else if (dado1 % 2 == 0) { //JUGADOR -> MESA
				ficha = jugadores[dado2].poll();
				mesa.push(ficha);
			}else { //MESA -> JUGADOR
				if (!mesa.isEmpty()) {
					ficha = mesa.pop();
					jugadores[dado2].add(ficha);
				}
			}
		}
		
		
		this.print();

		// buscar el jugador con más fichas negras
		int jMax = 0;
		int j = 0;
		boolean salir = false;
		Queue<Integer> actJugador = new LinkedList<Integer>();
		// COMPLETAR
		for (int i = 0; i < jugadores.length; i++) {
			actJugador = jugadores[i];
			while (!salir) {
				if (!jugadores[i].isEmpty()) {
					if (jugadores[i].poll()==0) {
						j = j+1 ;
					}
				}else {
					salir = true;
				}
			}
			salir = false;
			if (j>jMax) {
				jMax = j;
			}
			j = 0;
		}
		
		System.out.println("El número de negras máximo es: "+jMax);
		return jMax;
	}

	private void print() {
		for (int i = 0; i < jugadores.length; i++) {
			String s = "<";
			while (!jugadores[i].isEmpty())
				s = s + " " + jugadores[i].poll().toString();
			s = s + ">";
			System.out.println(i + ": " + s);
		}
		String s = "<";
		while (!mesa.isEmpty())
			s = s + " " + mesa.pop().toString();
		s = s + ">";
		System.out.println("Mesa: " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tirada> a = new ArrayList<Tirada>();
		a.add(new Tirada(2, 3));
		a.add(new Tirada(4, 1));
		a.add(new Tirada(3, 5));
		a.add(new Tirada(6, 3));

		new Juego().juego(5, a);

	}

}
