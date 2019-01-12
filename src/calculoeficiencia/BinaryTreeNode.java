package calculoeficiencia;

public class BinaryTreeNode<T> {
    T content;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(){}

    public BinaryTreeNode(T content, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.content = content;
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode(T pContent){
        this.content = pContent;
    }
}
