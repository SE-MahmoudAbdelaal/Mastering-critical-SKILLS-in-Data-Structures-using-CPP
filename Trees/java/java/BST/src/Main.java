public class Main {
    public static void main(String[] args) {

        Node<Integer> rootInteger = new Node<>(20);
        BST.insert(rootInteger, 5);
        BST.insert(rootInteger, 1);
        BST.insert(rootInteger, 2);
        BST.insert(rootInteger, 3);
        BST.insert(rootInteger, 4);
        BST.insert(rootInteger, 100);
        BST.insert(rootInteger, 30);
        BST.insert(rootInteger, 25);
        System.out.println(rootInteger );

        Node<String> rootString = new Node<>("banana");
        BST.insert(rootString, "grape");
        BST.insert(rootString, "mango");
        BST.insert(rootString, "pineapple");
        BST.insert(rootString, "cherry");
        BST.insert(rootString, "apple");
        BST.insert(rootString, "orange");
        BST.insert(rootString, "banana");
        System.out.println(rootString );
    }
}