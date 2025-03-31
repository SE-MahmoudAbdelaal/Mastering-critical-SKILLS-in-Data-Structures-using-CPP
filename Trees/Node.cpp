//
// Created by Mahmoud.SAbdelaal on 3/31/2025.
//

#include "Node.h"

// Constructor with default values
Node::Node(const int data, Node *leftNode, Node *rightNode)
    : data(data), leftNode(leftNode), rightNode(rightNode) {
}

// Destructor
Node::~Node() = default;

// Getters (marked [[nodiscard]] in Node.h)
int Node::getData() const {
    return data;
}

Node *Node::getLeftNode() const {
    return leftNode;
}

Node *Node::getRightNode() const {
    return rightNode;
}

// Setters
void Node::setData(int data) {
    this->data = data;
}

void Node::setLeftNode(Node *leftNode) {
    this->leftNode = leftNode;
}

void Node::setRightNode(Node *rightNode) {
    this->rightNode = rightNode;
}
