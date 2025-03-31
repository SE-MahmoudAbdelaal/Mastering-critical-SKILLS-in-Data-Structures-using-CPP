public class BST {


    public static  <T extends Comparable<T>> void insert(Node<T> root, T value) {
        if (root == null || value == null) {
            return;
        } else if (value.compareTo(root.getData()) < 0) {
            if (root.getLeft() == null) {
                root.setLeft(new Node<>(value));
            }else {
                insert(root.getLeft(), value);
            }
        } else if (value.compareTo(root.getData()) > 0) {
            if (root.getRight() == null) {
                root.setRight(new Node<>(value));
            }else {
                insert(root.getRight(), value);
            }
        }
    }


}
