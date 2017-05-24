package pl.sdacademy.tree;

public class Main {

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(8);
		binaryTree.insert(3);

		binaryTree.insert(1);

		binaryTree.insert(4);

		binaryTree.insert(5);
		binaryTree.insert(9);
		BTreePrinter.printNode(binaryTree.root);

	}

}
