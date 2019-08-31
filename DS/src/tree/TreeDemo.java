package tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class TreeDemo {

	public static Node insert(int data, Node root) {
		if (root == null) {
			root = new Node(data);
		} else if (root.data >= data) {
			root.left = insert(data, root.left);
		} else {
			root.right = insert(data, root.right);
		}
		return root;

	}

	public static boolean search(int data, Node root) {

		if (root == null) {
			return false;
		} else if (root.data == data) {
			return true;
		} else if (root.data >= data) {
			return search(data, root.left);
		} else {
			return search(data, root.right);
		}
	}

	public static int findMin(Node root) {

		if (root == null) {
			return -1;
		} else {
			while (root.left != null) {
				root = root.left;
			}
			return root.data;
		}

	}

	public static int findMax(Node root) {

		if (root == null) {
			return -1;
		} else {
			while (root.right != null) {
				root = root.right;
			}
			return root.data;
		}

	}

	public static int findHeightOfANode(Node root) {

		// Number of edges in the longest path from root to a leaf node

		int leftHeight = 0;
		int rightHeight = 0;
		if (root == null) {
			return -1;
		}

		return max(findHeightOfANode(root.left), findHeightOfANode(root.right)) + 1;
	}

	public static int max(int x, int y) {
		return x >= y ? x : y;
	}

	public static void main(String[] args) {
		Node root = null;
		root = insert(15, root);
		root = insert(20, root);
		root = insert(10, root);
		root = insert(5, root);
		root = insert(1, root);

		root = insert(12, root);
		root = insert(22, root);
		root = insert(25, root);
		root = insert(55, root);
		root = insert(21, root);

		/*
		 * System.out.println(search(5, root)); System.out.println(findMin(root));
		 * System.out.println(findMax(root));
		 * System.out.println(findHeightOfANode(root));
		 */

//		traverseTreeDepthFirst(root);
		traverseTreeBreadthFirst(root);
	}

	public static void traverseTreeDepthFirst(Node root) {
		if (root == null) {
			return;
		}

		// Pre Order
		System.out.print(root.data + " ");
		traverseTreeDepthFirst(root.left);
		traverseTreeDepthFirst(root.right);

		// In Order
		/*
		 * traverseTreeDepthFirst(root.left); System.out.print(root.data+" ");
		 * traverseTreeDepthFirst(root.right);
		 */

		// Post Order
		/*
		 * traverseTreeDepthFirst(root.left); traverseTreeDepthFirst(root.right);
		 * System.out.print(root.data+" ");
		 */
		

	}

	public static void traverseTreeBreadthFirst(Node root) {

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while (!q.isEmpty()) {
			Node node=q.poll();
			System.out.print(node.data+" ");
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}
		}

	}

}
