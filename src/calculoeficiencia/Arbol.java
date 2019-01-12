package calculoeficiencia;

import eliminarsublista.DoubleLinkedList;
import robot.CircularLinkedList;

public class Arbol extends BinarySearchTree<String>{
    //BinaryTreeNode<T> root;
    //int count;

    public Arbol(){
        //BinarySearchTree<String> ar = new BinarySearchTree<>();
        BinaryTreeNode<String> M = new BinaryTreeNode<>("M");
        BinaryTreeNode<String> E = new BinaryTreeNode<>("E");
        BinaryTreeNode<String> D = new BinaryTreeNode<>("D");
        BinaryTreeNode<String> C = new BinaryTreeNode<>("C");
        BinaryTreeNode<String> J = new BinaryTreeNode<>("J");
        BinaryTreeNode<String> F = new BinaryTreeNode<>("F");
        BinaryTreeNode<String> K = new BinaryTreeNode<>("K");
        BinaryTreeNode<String> Q = new BinaryTreeNode<>("Q");
        BinaryTreeNode<String> O = new BinaryTreeNode<>("O");

        this.root = M;
        M.left = E;
        M.right = Q;
        E.left = D;
        E.right = J;
        D.left = C;
        J.left = F;
        J.right = K;
        Q.left = O;

    }

    public double numMedioDeElementos(DoubleLinkedList<String> lista){
        //pre: elementos del arbol en la lista
        //post: suma de los costes de la busqueda de los elementos.
        int costes;
        if (lista==null){
            return 0.0;
        }else{
            costes = busquedaCostes(lista,root,-1);
        }
        return (costes);
    }

    public Integer busquedaCostes(DoubleLinkedList<String> lista, BinaryTreeNode<String> root,Integer cont) {
        int i = 0;
        boolean enc = false;
        int arbolIzq;
        int arbolDer;
        cont++;
        if (root != null) {
            if (lista.contains(root.content)) {
                enc = true;
            }
            arbolIzq = busquedaCostes(lista, root.left, cont);
            arbolDer = busquedaCostes(lista, root.right, cont);
            if (enc) { //HEMOS ENCONTRADO UN ELEM
                return (arbolIzq + arbolDer + cont);
            } else {
                return (arbolIzq + arbolDer);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Arbol miArbol = new Arbol();
        DoubleLinkedList<String> lista = new DoubleLinkedList<>();
        lista.add("E");
        lista.add("F");
        lista.add("O");
        
        double costes = miArbol.numMedioDeElementos(lista);
        System.out.println("LOS COSTES SON"+costes);
        System.out.println("PRUEBA TERMINADA");

    }
}
