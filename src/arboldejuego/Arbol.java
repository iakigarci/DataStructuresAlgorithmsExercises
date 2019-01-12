package arboldejuego;

public class Arbol {

    private BinaryTreeNode root;

    public Arbol() {
        BinaryTreeNode n1 = new BinaryTreeNode(new Info("B", 3));
        BinaryTreeNode n2 = new BinaryTreeNode(new Info("C", 3));
        BinaryTreeNode n3 = new BinaryTreeNode(new Info("D", 3));
        BinaryTreeNode n4 = new BinaryTreeNode(new Info("E", 3));
        BinaryTreeNode n5 = new BinaryTreeNode(new Info("F", 3));
        BinaryTreeNode n6 = new BinaryTreeNode(new Info("G", 3));
        BinaryTreeNode n7 = new BinaryTreeNode(new Info("H", 3));

        root = n1;
        n1.izq = n2;
        n2.padre = n1;
        n1.der = n3;
        n3.padre = n1;
        n2.izq = n4;
        n4.padre = n2;
        n2.der = n5;
        n5.padre = n2;
        n3.izq = n6;
        n6.padre = n3;
        n3.der = n7;
        n7.padre = n3;
    }

    public void print() {
        print(root);
    }

    private void print(BinaryTreeNode n) {
        if (n != null) {
            print(n.izq);
            n.content.print();
            print(n.der);
        }
    }

    public void premiar(int puntos, String elem) {
        premiar(puntos, elem, root);
    }

    private void premiar(int puntos, String elem, BinaryTreeNode root) {
        // COMPLETAR
        if (root!=null) {
            if (puntos<=0){
                premiar(puntos,elem,null);
            }else {
                if (root.content.s.equals(elem)) {
                    root.content.puntos = root.content.puntos + puntos;
                    if (root.padre!=null) {
                        premiar(puntos - 1, root.padre.content.s, root.padre);
                    }else{
                        premiar(0, null, null);
                    }
                } else {
                    premiar(puntos, elem, root.izq);
                    premiar(puntos, elem, root.der);
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Arbol a = new Arbol();
        a.print();
        System.out.println();
        a.premiar(8, "G");
        a.print();
    }
}