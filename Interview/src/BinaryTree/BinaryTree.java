package BinaryTree;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    private int height;
    private BinaryTreeNode root;
    private List<Integer> valueList = new ArrayList<Integer>();

    public BinaryTree() {
    }

    public void addNode(Integer value){
        this.root = addRecursive(root, value);
    }

    private BinaryTreeNode<Integer> addRecursive(BinaryTreeNode<Integer> current, Integer value) {
        if (current == null) {
            return new BinaryTreeNode<Integer>(value);
        }

        //null handling
        if (current.getContent() == null) {
            current.setContent(-128);
        }

        if (value < current.getContent()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getContent()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {
            return current;
        }
        return current;
    }

    public List<Integer> traverseInOrder(BinaryTreeNode<Integer> node) {
        if (node == this.root) {
            valueList = new ArrayList<>();
        }
        if (node != null) {
            traverseInOrder(node.getLeft());
            valueList.add(node.getContent());
            traverseInOrder(node.getRight());
        }
        return valueList;
    }

    public List<Integer> traversePreOrder(BinaryTreeNode<Integer> node) {
        if (node == this.root) {
            valueList = new ArrayList<>();
        }
        if (node != null) {
            valueList.add(node.getContent());
            traverseInOrder(node.getLeft());
            traverseInOrder(node.getRight());
        }
        return valueList;
    }

    public List<Integer> traversePostOrder(BinaryTreeNode<Integer> node) {
        if (node == this.root) {
            valueList = new ArrayList<>();
        }
        if (node != null) {
            traverseInOrder(node.getLeft());
            traverseInOrder(node.getRight());
            valueList.add(node.getContent());
        }
        return valueList;
    }


    /*
    LeetCode 100: Same Tree
    Given the roots of two binary trees p and q, write a function to check if they are the same or not.
    Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
     */
    public static boolean isSameTree(BinaryTreeNode p, BinaryTreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.getContent() != q.getContent()) {
            return false;
        }
        return isSameTree(p.getLeft(), q.getLeft()) && isSameTree(p.getRight(), q.getRight());
    }

    public static int maxDepth(BinaryTreeNode root) {
        if(root==null) {return 0;}
        else {return Math.max(maxDepth(root.getLeft()),maxDepth(root.getRight()))+1;}
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }
}
