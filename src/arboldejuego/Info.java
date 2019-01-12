package arboldejuego;

public class Info {
    String s;
    Integer puntos;

    public Info(String nom, int p) {
        s = nom;
        puntos = p;
    }

    public void print(){
        System.out.print(" " + s + " " + puntos + ", ");
    }
}
