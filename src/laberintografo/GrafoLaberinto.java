package laberintografo;

import java.util.*;

public class GrafoLaberinto extends GraphAL<String>{

    public LinkedList<String> buscarCamino(String inicio, String fin){
        Queue<String> porExaminar = new LinkedList<>();
        //boolean[][] examinados = new boolean[DEFAULT_CAPACITY][DEFAULT_CAPACITY];
        Stack<String> examinados = new Stack<>();
        HashMap<String, String> camino = new HashMap<>();
        LinkedList<String> resultado = new LinkedList<>();
        LinkedList<String> enlaces = new LinkedList<>();
        porExaminar.add(inicio);
        camino.put(inicio, null);
        boolean enc = false;
        String act = null;

        while (!enc && !porExaminar.isEmpty()){
            act = porExaminar.poll();
            //if (!examinados[act.indexOf(0)][act.indexOf(1)]){
                //examinados[act.indexOf(0)][act.indexOf(1)] = true;
            if (!examinados.contains(act)){
                if (!act.equals(inicio)){
                    camino.put(examinados.peek(),act);
                }
                examinados.push(act);
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
        if (enc) {
            boolean salir = false;
            resultado.add(inicio);
            String aux = null;
            while (!salir) {
                aux = camino.get(resultado.getLast());
                resultado.add(aux);
                if (aux.equals(fin)){
                    salir = true;
                }
            }
        }
        return resultado;
    }
}
