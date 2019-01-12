package evaluar;

import java.util.HashMap;

public class ArbolExpresion {
    BinaryTreeNode<InfoElemExp> root;

    public Integer evaluar(HashMap<String, Integer> tHash){
        if (root!=null){
            return evaluar(tHash,root);
        }else{
            return 0;
        }
    }

    public Integer evaluar(HashMap<String, Integer> tHash, BinaryTreeNode<InfoElemExp> nodo) {
        //pre: tHash cargado
        //post: se ha evaluado la expresion del arbol.
        if (nodo==null) return 0;
        else if(nodo.element.operador){ //OPERADOR
            int arbolIzquierdo = evaluar(tHash,nodo.left);
            int arbolDerecho = evaluar(tHash,nodo.right);

            if (nodo.element.elem.equals("*")){
                return arbolDerecho*arbolIzquierdo;
            }else {
                return 0;
            }
        }else{
            if (tHash.get(nodo.element.elem)!=null){
                return tHash.get((nodo.element.elem));
            }else{ return 0;}
        }
    }
}
