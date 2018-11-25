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
		int pelota = 0;
		int puntos = 0;
        if (tablero.length % 2 == 0) {
            pelota = tablero.length / 2;
        }else{
            pelota = (tablero.length / 2)+1;
        }
        boolean salir = false;
        Bloque bloque = tablero[pelota].pop();
        puntos = puntos + bloque.puntos;
        while (!salir ){
            if (bloque.direccion.equals("derecha")) {
                pelota = pelota+bloque.salto;
            }else{
                pelota = pelota-bloque.salto;
            }

            if (pelota>tablero.length || pelota<tablero.length){
                salir = true;
                puntos = 0;
                System.out.println("LA PELOTA SE HA SALIDO");
            }else if (tablero[pelota].isEmpty()){
                salir = true;
                System.out.println("TERMINADO");
            }else {
                bloque = tablero[pelota].pop();
                puntos = puntos + bloque.puntos;
            }

        }

		return puntos;
	} 
	
	
}
