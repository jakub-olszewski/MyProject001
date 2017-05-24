package pl.sdacademy.tree;

public class BinaryTree extends Tree {

  @Override
  public void insert(int value) {
    root = add(root, value);
    }


    private Node add(Node node, int value) {
	if (node == null) {
	    // zainicjowalismy roota
	    node = new Node(value);
	} else {
      int nodeValue = (int) node.getValue();
	    if (value < nodeValue) {
		node.setLeft(add(node.getLeft(), value));
	    } else {
		node.setRight(add(node.getRight(), value));
	    }
	}
	// zwrocilismy roota
	return node;
    }

}
