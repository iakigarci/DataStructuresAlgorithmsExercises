package laberintografo;

import java.util.*;

public class GrafoLaberinto extends GraphAL<String>{

    public LinkedList<String> buscarCamino(String inicio, String fin){
        Queue<String> porExaminar = new LinkedList<>();
        boolean[][] examinados = new boolean[DEFAULT_CAPACITY][DEFAULT_CAPACITY];
        boolean enc = false;
        String act = null;
        HashMap<String, String> camino = new HashMap<>();
        camino.put(inicio, null);
        LinkedList<String> resultado = new LinkedList<>();
        porExaminar.add(inicio);
        LinkedList<String> enlaces = new LinkedList<>();
        while (!enc && !porExaminar.isEmpty()){
            act = porExaminar.poll();
            if (!examinados[act.indexOf(0)][act.indexOf(1)]){
                examinados[act.indexOf(0)][act.indexOf(1)] = true;
                camino.
                if (act.equals(fin)){
                    enc = true;
                }else{
                    enlaces = adjList[Integer.parseInt(act)];
                    for (int i = 0; i < enlaces.size(); i++) {
                        ((LinkedList<String>) porExaminar).add(enlaces.get(i));
                    }
                }
            }
        }
    }
}
