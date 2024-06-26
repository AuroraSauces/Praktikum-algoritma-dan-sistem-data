package Latihan;

public class BinaryTree26 {
    Node26 root;

    BinaryTree26() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node26(data);
        } else {
            Node26 current = root;
            Node26 parent;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = new Node26(data);
                        return;
                    }
                } else if (data > current.data) {
                    current = current.right;
                    if (current == null) {
                        parent.right = new Node26(data);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    boolean find(int data) {
        Node26 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(Node26 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node26 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node26 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node26 getSuccessor(Node26 del) {
        Node26 successorParent = del;
        Node26 successor = del;
        Node26 current = del.right;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }

        Node26 parent = root;
        Node26 current = root;
        boolean isLeftChild = false;

        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data");
            return;
        }

        // Case 1: Node to be deleted has no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } 
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } 
        else {
            Node26 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }
    
    Node26 addRecursive(Node26 current, int data) {
        if (current == null) {
            return new Node26(data);
        }
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }
        return current;
    }
    
    int findMin() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        Node26 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }
    
    int findMax() {
        if (isEmpty()) {
            System.out.println("Tree Is Empty");
        }
        Node26 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }
    
    void printLeaf(Node26 node) {
        if (node != null) {
            
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            } else {
                printLeaf(node.left);
                printLeaf(node.right);
            }
            
        }
    }
    
    int countLeaf(Node26 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaf(node.left) + countLeaf(node.right);
    }
    
}
