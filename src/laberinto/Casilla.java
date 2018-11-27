package laberinto;

public class Casilla {

    int fila;
    int columna;

    public Casilla(int pX, int pY){
        fila = pX;
        columna = pY;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + columna;
        result = prime * result + fila;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Casilla other = (Casilla) obj;
        if (columna != other.columna)
            return false;
        if (fila != other.fila)
            return false;
        return true;
    }

    public String toString(){
        return "Casilla: " + fila + " " + columna;
    }
}
