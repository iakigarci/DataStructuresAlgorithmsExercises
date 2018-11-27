package colegio;

import java.util.LinkedList;
import java.util.Queue;

public class Colegio {
    Queue<Queue<String>> alumnos;


    public Colegio(){
        alumnos = new LinkedList<>();
    }

    public void repartirRegalos(Queue<String> regalos) {

        Queue<String> alumnosC = new LinkedList<>();
        String reg = null;
        String alum = null;
        while (!regalos.isEmpty() && !alumnos.isEmpty()) {
            reg = regalos.poll();
            alumnosC = alumnos.poll();
            while (!alumnosC.isEmpty()) { //ALUMNOS POR CURSO
                alum = alumnosC.poll();
                System.out.println("Se ha dado el regalo"+reg+" -> "+alum);
            }
        }
    }

    public static void main(String[] args){
        Colegio colegio = new Colegio();

        Queue<String> c1 = new LinkedList<>();
        c1.offer("a");
        c1.offer("b");
        c1.offer("c");
        c1.offer("d");

        Queue<String> c2 = new LinkedList<>();
        c2.offer("e");
        c2.offer("f");
        c2.offer("g");
        c2.offer("h");

        Queue<String> c3 = new LinkedList<>();
        c3.offer("i");
        c3.offer("j");
        c3.offer("k");
        c3.offer("l");

        Queue<String> c4 = new LinkedList<>();
        c4.offer("m");
        c4.offer("n");
        c4.offer("o");
        c4.offer("p");

        Queue<String> c5 = new LinkedList<>();
        c5.offer("q");
        c5.offer("r");
        c5.offer("s");
        c5.offer("t");

        Queue<String> c6 = new LinkedList<>();
        c6.offer("w");
        c6.offer("x");
        c6.offer("y");
        c6.offer("z");

        colegio.alumnos.offer(c1);
        colegio.alumnos.offer(c2);
        colegio.alumnos.offer(c3);
        colegio.alumnos.offer(c4);
        colegio.alumnos.offer(c5);
        colegio.alumnos.offer(c6);


        Queue<String> regalos = new LinkedList<>();
        regalos.offer("r1");
        regalos.offer("r2");
        regalos.offer("r3");
        regalos.offer("r4");
        regalos.offer("r5");
        regalos.offer("r6");
        regalos.offer("r7");
        regalos.offer("r8");

        colegio.repartirRegalos(regalos);
    }
}
