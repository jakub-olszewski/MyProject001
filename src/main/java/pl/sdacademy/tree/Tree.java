package pl.sdacademy.tree;

public class Tree {

    Node root;

    public void insert(int data) {
	root = insert(root, data);
    }

    Node insert(Node node, int data) {
	if (node == null) {
	    node = new Node(data);
	} else {
	    if (node.getRight() == null) {
		node.setRight(insert(node.getRight(), data));
	    } else {
		node.setLeft(insert(node.getLeft(), data));
	    }
	}
	return node;
    }

    public void print() {
	print(root);
    }

    private void print(Node node) {
	if (node != null) {
	    System.out.print(node.getValue() + " ");
	    print(node.getLeft());
	    print(node.getRight());
	}
    }

}
