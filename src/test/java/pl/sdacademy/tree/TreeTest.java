package pl.sdacademy.tree;

import org.junit.Test;

public class TreeTest {

    @Test
    public void test() {

	Tree tree = new Tree();
	tree.insert(3);// mamy przypisana 3 i to jest korzen/root
	tree.insert(2);
	tree.insert(9);
	tree.insert(4);
	tree.insert(1);
	tree.insert(5);

	tree.print();

    }

}
