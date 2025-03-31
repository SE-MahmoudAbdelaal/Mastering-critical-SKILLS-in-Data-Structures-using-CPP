#include <iostream>
#include "Node.h"

int main() {
    Node root(10);  // Create a root node with data = 10

    Node leftChild(5);
    Node rightChild(15);

    root.setLeftNode(&leftChild);
    root.setRightNode(&rightChild);

    std::cout << "Root: " << root.getData() << std::endl;
    std::cout << "Left Child: " << root.getLeftNode()->getData() << std::endl;
    std::cout << "Right Child: " << root.getRightNode()->getData() << std::endl;

    return 0;
}
