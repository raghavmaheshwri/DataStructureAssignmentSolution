package com.gl.driver;

class Node {
	Node left;
	Node right;
	int data;

	Node(int key) {
		left = null;
		data = key;
		right = null;
	}
}

public class BinarySearchTree {

	Node node;
	Node prev = null;
	Node currentHead = null;

	//Creating Right Skewed Tree 
	void BinaryTree(Node root) {
		if (root == null) {
			return;
		}
		Node leftNode = root.left;
		BinaryTree(leftNode);
		Node rightNode = root.right;
		if (currentHead == null) {
			currentHead = root;
			root.left = null;
			prev = root;
		} else {

			prev.right = root;
			root.left = null;
			prev = root;
		}
		BinaryTree(rightNode);
	}
	
	
	//traversing the right skewed tree
	void traverseTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		traverseTree(root.right);
	}

	//Driver Code 
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		tree.BinaryTree(tree.node);
		
		System.out.println("OutPut: \n------------------");
		tree.traverseTree(tree.currentHead);
	}

}
