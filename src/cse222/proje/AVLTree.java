package cse222.proje;

import java.util.Stack;

public class AVLTree <T extends Comparable<T>> implements Iterable<T>{

    private class Node{
        private Node leftChild, rightChild;
        private T value;
        private int height;
        private int balanceValue;

        public Node(T value){
            this.value = value;
        }

        public Node getLeftChild(){
            return this.leftChild;
        }

        public Node getRightChild(){
            return this.rightChild;
        }

        public void setLeftChild(Node leftChild){
            this.leftChild = leftChild;
        }

        public void setRightChild(Node rightChild){
            this.rightChild = rightChild;
        }
    }

    private Node root;

    public boolean contains(T value){
        if(root == null)
            return false;
        Node current = root;
        while(current != null) {
            int cmp = value.compareTo(current.value);
            if(cmp < 0)
                current = current.leftChild;
            else if(cmp > 0)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public boolean insert(T value){
        if(value == null)
            return false;
        if(contains(value) == false){
            root = insert(root, value);
            return true;
        }
        return false;
    }

    private Node insert(Node node, T value) {
        if(node == null)
            return new Node(value);
        int compare = value.compareTo(node.value);
        if(compare < 0)
            node.leftChild = insert(node.leftChild, value);
        else
            node.rightChild = insert(node.rightChild, value);

        int leftNodeHeight;
        int rightNodeHeight;

        if(node.leftChild == null) leftNodeHeight = -1;
        else leftNodeHeight = node.leftChild.height;

        if(node.rightChild == null) rightNodeHeight = -1;
        else rightNodeHeight = node.rightChild.height;

        node.height = 1 + Math.max(leftNodeHeight, rightNodeHeight);

        node.balanceValue = rightNodeHeight - leftNodeHeight;

        return balance(node);
    }

    private Node balance(Node node){
        if(node.balanceValue == -2){
            if(node.leftChild.balanceValue <= 0)
                return leftToLeft(node);
            else
                return leftToRight(node);
        }

        else if(node.balanceValue == 2){
            if(node.rightChild.balanceValue >= 0)
                return rightToRight(node);
            else
                return rightToLeft(node);
        }

        return node;
    }

    private Node leftToLeft(Node node){
        return rotateRight(node);
    }

    private Node leftToRight(Node node){
        node.leftChild = rotateLeft(node.leftChild);
        return leftToLeft(node);
    }

    private Node rightToRight(Node node){
        return rotateLeft(node);
    }

    private Node rightToLeft(Node node){
        node.rightChild = rotateRight(node.rightChild);
        return rightToRight(node);
    }

    private Node rotateLeft(Node node){
        Node parentNode = node.rightChild;
        node.rightChild = parentNode.leftChild;
        parentNode.leftChild = node;

        int leftHeight, rightHeight;
        if(node.leftChild == null)
            leftHeight = -1;
        else
            leftHeight = node.leftChild.height;
        if(node.rightChild == null)
            rightHeight = -1;
        else
            rightHeight = node.rightChild.height;
        node.height = 1 + Math.max(leftHeight, rightHeight);
        node.balanceValue = leftHeight - rightHeight;

        if(parentNode.leftChild == null)
            leftHeight = -1;
        else
            leftHeight = parentNode.leftChild.height;
        if(parentNode.rightChild == null)
            rightHeight = -1;
        else
            rightHeight = parentNode.rightChild.height;
        parentNode.height = 1 + Math.max(leftHeight, rightHeight);
        parentNode.balanceValue = leftHeight - rightHeight;

        return parentNode;
    }

    private Node rotateRight(Node node){
        Node parentNode = node.leftChild;
        node.leftChild = parentNode.rightChild;
        parentNode.rightChild = node;

        int leftHeight, rightHeight;
        if(node.leftChild == null)
            leftHeight = -1;
        else
            leftHeight = node.leftChild.height;
        if(node.rightChild == null)
            rightHeight = -1;
        else
            rightHeight = node.rightChild.height;
        node.height = 1 + Math.max(leftHeight, rightHeight);
        node.balanceValue = leftHeight - rightHeight;

        if(parentNode.leftChild == null)
            leftHeight = -1;
        else
            leftHeight = parentNode.leftChild.height;
        if(parentNode.rightChild == null)
            rightHeight = -1;
        else
            rightHeight = parentNode.rightChild.height;
        parentNode.height = 1 + Math.max(leftHeight, rightHeight);
        parentNode.balanceValue = leftHeight - rightHeight;

        return parentNode;
    }

    public boolean remove(T value){
        if(value == null)
            return false;
        if (contains(value)){
            root = remove(root, value);
            return true;
        }
        return false;
    }

    private Node remove(Node node, T value){
        if(node == null)
            return null;
        int compare = value.compareTo(node.value);

        if(compare < 0)
            node.leftChild = remove(node.leftChild, value);
        else if(compare > 0)
            node.rightChild = remove(node.rightChild, value);
        else{
            if(node.leftChild == null)
                return node.rightChild;
            else if(node.rightChild == null)
                return node.leftChild;
            else{
                T temp = leftTreeMaxValue(node.leftChild);
                node.value = temp;

                node.leftChild = remove(node.leftChild, temp);
            }
        }

        node.height = 1 + Math.max(node.leftChild.height, node.rightChild.height);
        node.balanceValue = node.leftChild.height - node.rightChild.height;

        return balance(node);
    }

    private T leftTreeMaxValue(Node node){
        while(node.rightChild != null)
            node = node.rightChild;
        return node.value;
    }

    public int height(){
        if(root == null)
            return 0;
        return root.height;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new Iterator();
    }

    public class Iterator implements java.util.Iterator<T> {
        Node traversal = root;
        Stack<Node> stackNode = new Stack<>();
        public Iterator(){
            stackNode.push(root);
        }

        @Override
        public boolean hasNext() {
            return root != null && !stackNode.isEmpty();
        }

        @Override
        public T next() {
            while(traversal != null && traversal.leftChild != null){
                stackNode.push(traversal.leftChild);
                traversal = traversal.leftChild;
            }

            Node node = stackNode.pop();

            if(node.rightChild != null){
                stackNode.push(node.rightChild);
                traversal = node.rightChild;
            }

            return node.value;
        }
    }
}
