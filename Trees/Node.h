//
// Created by Mahmoud.SAbdelaal on 3/31/2025.
//

#ifndef NODE_H
#define NODE_H

class Node {
private:
    int data;
    Node* leftNode;
    Node* rightNode;

public:
    // Constructors
    explicit Node(int data = 0, Node* leftNode = nullptr, Node* rightNode = nullptr);

    // Destructor
    ~Node();

    // Getters (const to prevent modification)
    [[nodiscard]] int getData() const;
    [[nodiscard]] Node* getLeftNode() const;
    [[nodiscard]] Node* getRightNode() const;

    // Setters
    void setData(int data);
    void setLeftNode(Node* leftNode);
    void setRightNode(Node* rightNode);
};

#endif // NODE_H
