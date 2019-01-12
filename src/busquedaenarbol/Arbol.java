package busquedaenarbol;

public class Arbol {
    BinaryTreeNode<Integer> root;

    public Arbol(){
        this.root = new BinaryTreeNode<>();
        this.root.valores = new Integer[4];
        this.root.valores[0] = 15;
        this.root.valores[1] = 45;
        this.root.valores[2] = 75;
        this.root.valores[3] = 93;

        this.root.hijos = new BinaryTreeNode[5];
        this.root.hijos[0] = new BinaryTreeNode<>();
        this.root.hijos[1] = new BinaryTreeNode<>();
        this.root.hijos[2] = new BinaryTreeNode<>();
        this.root.hijos[3] = new BinaryTreeNode<>();
        this.root.hijos[4] = new BinaryTreeNode<>();
        this.root.hijos[0].valores = new Integer[1];
        this.root.hijos[1].valores = new Integer[3];
        this.root.hijos[2].valores = new Integer[4];
        this.root.hijos[3].valores = new Integer[2];
        this.root.hijos[4].valores = new Integer[3];

        this.root.hijos[0].valores[0] = 8;

        this.root.hijos[1].valores[0] = 18;
        this.root.hijos[1].valores[1] = 20;
        this.root.hijos[1].valores[2] = 30;

        this.root.hijos[2].valores[0] = 49;
        this.root.hijos[2].valores[1] = 52;
        this.root.hijos[2].valores[2] = 67;
        this.root.hijos[2].valores[3] = 72;

        this.root.hijos[3].valores[0] = 80;
        this.root.hijos[3].valores[1] = 88;

        this.root.hijos[3].hijos = new BinaryTreeNode[2];
        this.root.hijos[3].hijos[0] = new BinaryTreeNode<>();
        this.root.hijos[3].hijos[1] = new BinaryTreeNode<>();
        this.root.hijos[3].hijos[0].valores = new Integer[2];
        this.root.hijos[3].hijos[1].valores = new Integer[2];
        this.root.hijos[3].hijos[0].valores[0] = 76;
        this.root.hijos[3].hijos[0].valores[1] = 78;
        this.root.hijos[3].hijos[1].valores[0] = 90;
        this.root.hijos[3].hijos[1].valores[1] = 92;

        this.root.hijos[4].valores[0] = 94;
        this.root.hijos[4].valores[1] = 96;
        this.root.hijos[4].valores[2] = 99;
    }

    public boolean esta(Integer elem){
        if (root==null) return false;
        else return esta(elem, root);
    }

    public boolean esta(Integer elem, BinaryTreeNode<Integer> root) {
        boolean enc = false;
        int i = 0;
        if (root == null) return false;
        else if (root.hijos != null) {
            while (!enc && i<root.valores.length) {
                if (root.valores[i] == elem) {
                    enc = true;
                } else if (root.valores[i] > elem) {
                    if (i == 0) {
                        enc = esta(elem, root.hijos[0]);
                    } else {
                        enc = esta(elem, root.hijos[i]);
                    }
                } else { //root.valores[i]>elem
                    if (i == root.valores.length - 1) { //ULTIMO
                        enc = esta(elem, root.hijos[i + 1]);
                    }
                }
                i++;
            }
        } else {
            while (!enc && i < root.valores.length) {
                if (root.valores[i] == elem) enc = true;
                i++;
            }
        }
        return enc;
    }

    public static void main(String[] args) {
        Arbol ar = new Arbol();
        System.out.println("PRUEBA NUM=8");
        if (ar.esta(8)) {
            System.out.println("ESTÁ");
        }else{
            System.out.println("NO SE ENCUENTRA");
        }

        System.out.println("PRUEBA NUM=20");
        if (ar.esta(20)) {
            System.out.println("ESTÁ");
        }else{
            System.out.println("NO SE ENCUENTRA");
        }

        System.out.println("PRUEBA NUM=10");
        if (ar.esta(10)) {
            System.out.println("ESTÁ");
        }else{
            System.out.println("NO SE ENCUENTRA");
        }

        System.out.println("PRUEBA NUM=76");
        if (ar.esta(76)) {
            System.out.println("ESTÁ");
        }else{
            System.out.println("NO SE ENCUENTRA");
        }

        System.out.println("PRUEBA NUM=96");
        if (ar.esta(96)) {
            System.out.println("ESTÁ");
        }else{
            System.out.println("NO SE ENCUENTRA");
        }
    }
}
