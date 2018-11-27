package laberinto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Laberinto {

    private int[][] laberinto =
                {   {1,1,1,0,0,1,0},
                    {1,1,0,1,0,1,0},
                    {0,1,0,1,1,1,1},
                    {1,1,1,0,1,0,0},
                    {0,0,1,1,1,0,1},
                    {1,0,0,0,1,0,1},
                    {1,1,1,1,1,0,0},
                    {1,0,0,0,0,1,1},
                    {1,1,1,1,1,1,1} };

    public boolean haySalida(){
        Casilla inicio = new Casilla(0, 0);
        Casilla fin = new Casilla(laberinto.length-1,laberinto[0].length-1);

        Queue<Casilla> porExaminar = new LinkedList<Casilla>();
        porExaminar.add(inicio);
        laberinto[0][0] = 8; // indica que ha sido "marcada"
        boolean encontrado = false;
        Casilla act = inicio;
        int fila = 0;
        int columna = 0;
        if (inicio==fin) {
            encontrado = true;
        }else{
            while (!encontrado && !porExaminar.isEmpty()){
                act = porExaminar.poll();
                laberinto[act.fila][act.columna] = 8;
                if (act.equals(fin)) {
                    encontrado = true;
                }else{
                    fila = act.fila;
                    columna = act.columna;
                    if (fila+1<=laberinto.length-1 && laberinto[fila+1][columna]==1) {
                        ((LinkedList<Casilla>) porExaminar).push(new Casilla(fila+1,columna));
                    }
                    if (fila-1<=laberinto.length-1 && fila-1>=0 && laberinto[fila-1][columna]==1) {
                        ((LinkedList<Casilla>) porExaminar).push(new Casilla(fila-1,columna));
                    }
                    if (columna+1<=laberinto[0].length-1 && laberinto[fila][columna+1]==1) {
                        ((LinkedList<Casilla>) porExaminar).push(new Casilla(fila, columna+1));
                    }
                    if (columna-1<=laberinto[0].length-1 && columna-1>=0 && laberinto[fila][columna-1]==1) {
                        ((LinkedList<Casilla>) porExaminar).push(new Casilla(fila, columna-1));
                    }
                }
            }
        }
        return encontrado;
    }



    public void print(){
        for (int i = 0; i < laberinto.length; i++){
            for (int j = 0; j < laberinto[0].length; j++){
                System.out.print(laberinto[i][j]);
            }
            System.out.println();
        }
    }
    public String toString() {
        return "Laberinto [laberinto=" + Arrays.toString(laberinto) + "]";
    }

    public static void main(String[] args) {
        Laberinto l = new Laberinto();
        // l.haySalida();
        System.out.print(l.haySalida());
    }
}

