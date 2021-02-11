package BinaryTree;

public class TreeRun {
    public static void main(String[] args){
        BinaryTree bTree = new BinaryTree();
        bTree.addNode(4);
        bTree.addNode(3);
        bTree.addNode(2);
        bTree.addNode(5);
        bTree.addNode(8);
        bTree.addNode(6);

        System.out.println("bTree max-depth:\t" + BinaryTree.maxDepth(bTree.getRoot()));
        System.out.println("Depth-First Search Traversals:");
        System.out.println("Depth-First Search Traversals:");
        System.out.println("Inorder:\t" + bTree.traverseInOrder(bTree.getRoot()));
        System.out.println("PreOrder:\t" + bTree.traversePreOrder(bTree.getRoot()));
        System.out.println("PostOrder:\t" + bTree.traversePostOrder(bTree.getRoot()));

        BinaryTree bTree1 = new BinaryTree();
        bTree1.addNode(4);
        bTree1.addNode(3);
        bTree1.addNode(2);
        bTree1.addNode(5);
        bTree1.addNode(8);
        bTree1.addNode(6);
        System.out.println("bTree == bTree1:\t" + BinaryTree.isSameTree(bTree.getRoot(), bTree1.getRoot()));

        BinaryTree bTree2 = new BinaryTree();
        bTree2.addNode(4);
        bTree2.addNode(65);
        bTree2.addNode(2);
        bTree2.addNode(5);
        bTree2.addNode(8);
        bTree2.addNode(6);
        System.out.println("bTree == bTree2:\t" + BinaryTree.isSameTree(bTree.getRoot(), bTree2.getRoot()));
    }
}
