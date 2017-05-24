package pl.sdacademy.tree;

public class Tree {

    Node root;

    /**
     * Dodanie elementu do drzewa
     * 
     * @param value
     */
    public void insert(int value) {
	root = insert(root, value);
    }

    /**
     * Dodawanie wartosci do drzewa
     * 
     * @param node
     * @param value
     * @return
     */
    private Node insert(Node node, int value) {
	if (node == null) {
	    // zainicjowalismy roota
	    node = new Node(value);
	} else {
	    if (node.getRight() == null) {
		node.setRight(insert(node.getRight(), value));
	    } else {
		node.setLeft(insert(node.getLeft(), value));
	    }
	}
	// zwrocilismy roota
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

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

}
