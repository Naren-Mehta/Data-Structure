package tree;

public class CheckBinaryTreeIsBST {

	public static boolean isSubTreeLesser(Node root, int data) {

		if(root== null) {
			return true;
		}
		if(root.data <=data 
				&& isSubTreeLesser(root.left,data)
				&& isSubTreeLesser(root.right,data)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isSubTreeGreater(Node root, int data) {

		if(root== null) {
			return true;
		}
		if(root.data >data 
				&& isSubTreeGreater(root.left,data)
				&& isSubTreeGreater(root.right,data)) {
			return true;
		}
		
		return false;
	}

	public static boolean isBinarySearchTree(Node root) {
		
		if(root== null) {
			return true;
		}
		if(isSubTreeLesser(root.left, root.data)
				&& isSubTreeGreater(root.right, root.data)
				&& isBinarySearchTree(root.left)
				&& isBinarySearchTree(root.right)) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		Node root = null;
		root = TreeDemo.insert(15, root);
		root = TreeDemo.insert(20, root);
		root = TreeDemo.insert(10, root);
		root = TreeDemo.insert(5, root);
		root = TreeDemo.insert(1, root);

		root = TreeDemo.insert(12, root);
		root = TreeDemo.insert(22, root);
		root = TreeDemo.insert(25, root);
		root = TreeDemo.insert(55, root);
		root = TreeDemo.insert(21, root);

		root.left.left.left.data = 200;

		TreeDemo.traverseTreeDepthFirst(root);

		System.out.println("\n"+isBinarySearchTree(root));
	}

}
