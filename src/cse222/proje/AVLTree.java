package cse222.proje;

import java.util.Stack;

public class AVLTree <T extends Comparable<T>> extends BinarySearchTree<T> implements Iterable<T>{

    private static class AVLNode<T> extends BinarySearchTree.Node<T> {
        private int height;
        private int balanceValue;

        public AVLNode(T value){
            super(value);
        }
    }


    public boolean contains(T value){
        if(root == null)
            return false;
        Node<T> current = root;
        while(current != null) {
            int cmp = value.compareTo(current.data);
            if(cmp < 0)
                current = current.left;
            else if(cmp > 0)
                current = current.right;
            else
                return true;
        }
        return false;
    }

    @Override
    public void add(T value){
        if(value == null)
            return;
        if(!contains(value)){
            root = add((AVLNode<T>) root, value);
        }
    }

    private AVLNode<T> add(AVLNode<T> node, T value) {
        if(node == null)
            return new AVLNode<T>(value);
        int compare = value.compareTo(node.data);
        if(compare < 0)
            node.left = add((AVLNode<T>) node.left, value);
        else
            node.right = add((AVLNode<T>) node.right, value);

        int leftNodeHeight;
        int rightNodeHeight;

        if(node.left == null) leftNodeHeight = -1;
        else leftNodeHeight = ((AVLNode<T>)node.left).height;

        if(node.right == null) rightNodeHeight = -1;
        else rightNodeHeight = ((AVLNode<T>)node.right).height;

        node.height = 1 + Math.max(leftNodeHeight, rightNodeHeight);

        node.balanceValue = rightNodeHeight - leftNodeHeight;

        return balance(node);
    }

    private AVLNode<T> balance(AVLNode<T> node){
        if(node.balanceValue == -2){
            if(((AVLNode<T>)node.left).balanceValue <= 0)
                return leftToLeft(node);
            else
                return leftToRight(node);
        }

        else if(node.balanceValue == 2){
            if(((AVLNode<T>)node.right).balanceValue >= 0)
                return rightToRight(node);
            else
                return rightToLeft(node);
        }

        return node;
    }

    private AVLNode<T> leftToLeft(AVLNode<T> node){
        return rotateRight(node);
    }

    private AVLNode<T> leftToRight(AVLNode<T> node){
        node.left = rotateLeft((AVLNode<T>) node.left);
        return leftToLeft(node);
    }

    private AVLNode<T> rightToRight(AVLNode<T> node){
        return rotateLeft(node);
    }

    private AVLNode<T> rightToLeft(AVLNode<T> node){
        node.right = rotateRight((AVLNode<T>) node.right);
        return rightToRight(node);
    }

    private AVLNode<T> rotateLeft(AVLNode<T> node){
        AVLNode<T> parentNode = (AVLNode<T>) node.right;
        node.right = parentNode.left;
        parentNode.left = node;

        int leftHeight, rightHeight;
        if(node.left == null)
            leftHeight = -1;
        else
            leftHeight = ((AVLNode<T>)node.left).height;
        if(node.right == null)
            rightHeight = -1;
        else
            rightHeight = ((AVLNode<T>)node.right).height;
        node.height = 1 + Math.max(leftHeight, rightHeight);
        node.balanceValue = leftHeight - rightHeight;

        if(parentNode.left == null)
            leftHeight = -1;
        else
            leftHeight = ((AVLNode<T>)parentNode.left).height;
        if(parentNode.right == null)
            rightHeight = -1;
        else
            rightHeight = ((AVLNode<T>)parentNode.right).height;
        parentNode.height = 1 + Math.max(leftHeight, rightHeight);
        parentNode.balanceValue = leftHeight - rightHeight;

        return parentNode;
    }

    private AVLNode<T> rotateRight(AVLNode<T> node){
        AVLNode<T> parentNode = (AVLNode<T>) node.left;
        node.left = parentNode.right;
        parentNode.right = node;

        int leftHeight, rightHeight;
        if(node.left == null)
            leftHeight = -1;
        else
            leftHeight = ((AVLNode<T>)node.left).height;
        if(node.right == null)
            rightHeight = -1;
        else
            rightHeight = ((AVLNode<T>)node.right).height;
        node.height = 1 + Math.max(leftHeight, rightHeight);
        node.balanceValue = leftHeight - rightHeight;

        if(parentNode.left == null)
            leftHeight = -1;
        else
            leftHeight = ((AVLNode<T>)parentNode.left).height;
        if(parentNode.right == null)
            rightHeight = -1;
        else
            rightHeight = ((AVLNode<T>)parentNode.right).height;
        parentNode.height = 1 + Math.max(leftHeight, rightHeight);
        parentNode.balanceValue = leftHeight - rightHeight;

        return parentNode;
    }

    public T remove(T value){
        if(value == null)
            return null;
        if (contains(value)){
            root = remove((AVLNode<T>) root, value);
            return value;
        }
        return null;
    }

    private AVLNode<T> remove(AVLNode<T> node, T value){
        if(node == null)
            return null;
        int compare = value.compareTo(node.data);

        if(compare < 0)
            node.left = remove((AVLNode<T>) node.left, value);
        else if(compare > 0)
            node.right = remove((AVLNode<T>) node.right, value);
        else{
            if(node.left == null)
                return (AVLNode<T>) node.right;
            else if(node.right == null)
                return (AVLNode<T>) node.left;
            else{
                T temp = leftTreeMaxValue((AVLNode<T>) node.left);
                node.data = temp;

                node.left = remove((AVLNode<T>) node.left, temp);
            }
        }

        if(node.left != null && node.right != null) {
            node.height = 1 + Math.max(((AVLNode<T>) node.left).height, ((AVLNode<T>) node.right).height);
            node.balanceValue = ((AVLNode<T>) node.left).height - ((AVLNode<T>) node.right).height;
        }

        else if(node.left == null){
            node.height = 1 + ((AVLNode<T>)node.right).height;
            node.balanceValue = (-1) - ((AVLNode<T>)node.right).height;
        }

        else{
            node.height = 1 + ((AVLNode<T>)node.left).height;
            node.balanceValue = ((AVLNode<T>)node.left).height - (-1);
        }

        return balance(node);
    }

    private T leftTreeMaxValue(AVLNode<T> node){
        while(node.right != null)
            node = (AVLNode<T>) node.right;
        return node.data;
    }

    public int height(){
        if(root == null)
            return 0;
        return ((AVLNode<T>)root).height;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new Iterator();
    }

    public class Iterator implements java.util.Iterator<T> {
        AVLNode<T> traversal = (AVLNode<T>) root;
        Stack<AVLNode<T>> stackNode = new Stack<>();
        public Iterator(){
            stackNode.push((AVLNode<T>)root);
        }

        @Override
        public boolean hasNext() {
            return root != null && !stackNode.isEmpty();
        }

        @Override
        public T next() {
            while(traversal != null && traversal.left != null){
                stackNode.push((AVLNode<T>) traversal.left);
                traversal = (AVLNode<T>) traversal.left;
            }

            AVLNode<T> node = stackNode.pop();

            if(node.right != null){
                stackNode.push((AVLNode<T>) node.right);
                traversal = (AVLNode<T>) node.right;
            }

            return node.data;
        }
    }
}
