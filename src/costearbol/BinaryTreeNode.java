package costearbol;

public class BinaryTreeNode {
    Tarea element;
    BinaryTreeNode left, right;

    public BinaryTreeNode(Tarea element, BinaryTreeNode left, BinaryTreeNode right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode(){ }
}
