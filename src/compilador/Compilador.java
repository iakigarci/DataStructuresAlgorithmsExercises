package compilador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Compilador {

    HashMap<String, ArrayList<String>> dependencias;

    public Compilador(){
        dependencias = new HashMap<String, ArrayList<String>>();

        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("PR2");
        l1.add("PR3");
        dependencias.put("PR1", l1);

        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("PR5");
        l2.add("PR3");
        dependencias.put("PR2", l2);

        ArrayList<String> l15 = new ArrayList<String>();
        l15.add("PR5");
        l15.add("PR14");
        dependencias.put("PR15", l15);

        ArrayList<String> l3 = new ArrayList<String>();
        l3.add("PR5");
        dependencias.put("PR3", l3);

        ArrayList<String> l5 = new ArrayList<String>();
        l5.add("PR2");
        dependencias.put("PR5", l5);

        ArrayList<String> l14 = new ArrayList<String>();
        l14.add("PR25");
        dependencias.put("PR14", l14);

    }


    public boolean esV�lido(String prog) {
        // Postcondici�n: el resultado ser� true si se han definido TODOS los
        //        programas usados directa o indirectamente por �prog� y false si no

        Queue<String> porExaminar = new LinkedList<String>();
        HashSet<String> examinados = new HashSet<String>();
        boolean esValido = true;
        porExaminar.add(prog);
        String act = null;
        ArrayList<String> enlaces = new ArrayList<>();
        while (esValido && !porExaminar.isEmpty()){
            act = porExaminar.poll();
            if (!examinados.contains(act)){
                examinados.add(act);
                if (!dependencias.containsKey(act)){
                    esValido = false;
                }else {
                    enlaces = dependencias.get(act);
                    for (int i = 0; i < enlaces.size(); i++) {
                        ((LinkedList<String>) porExaminar).add(enlaces.get(i));
                    }
                }
            }
        }

        return esValido;
    }


    public static void main(String[] args) {

        Compilador c = new Compilador();

        System.out.println("El programa PR1 deberia ser correcto (true) y es: " + c.esV�lido("PR1"));
        System.out.println("El programa PR15 deberia ser incorrecto (false) y es: " + c.esV�lido("PR15"));

    }

}
