package BinaryTree;

public class BinaryTreeNode<T> {
    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;
    private T content;

    public BinaryTreeNode(T value) {
        left = null;
        right = null;
        content = value;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
