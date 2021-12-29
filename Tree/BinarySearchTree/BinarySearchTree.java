

public class BinarySearchTree {
	// Creating node constructor
	class TreeNode{
		private int data;
		private TreeNode leftChild;
		private TreeNode rightChild;
		
		public TreeNode() {
			this.leftChild = null;
			this.rightChild = null;
		}
		public TreeNode(int element) {
			this.data = element;
			this.leftChild = null;
			this.rightChild = null;
		}
	}
	public TreeNode root;
	
	// creating constructor for BST;
	public BinarySearchTree() {
		this.root = null;
	}
	
	// Defining insert method
	public void insert(int element) {
		//set current to root and prev to null
		TreeNode current = this.root;
		TreeNode prev = null;
		// if list is empty need to create newNode
		TreeNode newNode = new TreeNode(element);
		
		// Adding new element is always at bottom of tree 
		while(current  != null) {
			// set prev==current
			prev = current;
			if(current.data <element) {
				current = current.rightChild;
			}else {
				current = current.leftChild;
			}
		}
		//intially prev = empty means above loop not executed and current also null
		if(prev==null) {
			// Now tree is empty add only node in tree !
			root = newNode;
			System.out.println("Root Data ="+root.data);
			return ; // stop 
		}
		if(prev.data < element) {
			prev.rightChild = newNode;
			System.out.println("RightChild ="+prev.rightChild.data);
		}else {
			prev.leftChild = newNode;
			System.out.println("LeftChild ="+prev.leftChild.data);
		}
	}
	
	//Delete a Node !!!!
	
	
	
	//Use Of Inorder Traversal !!!
	public void inorderTraversal(TreeNode node) {
		// Check for empty condition
		if (node == null) {
			return; // Stop
		}
		// set root for node
		//this.root = node;

		// Left Child has First access
		if (node.leftChild != null) {
			// Use Recursion
			inorderTraversal(node.leftChild);
		}
		
		// Process the node --> Display the Content and count
		System.out.println(node.data+ " ");
		
		//Right Child has last access 
		if (node.rightChild !=null) {
			//Use Recursion 
			inorderTraversal(node.rightChild);
		}
	}
	
	
	//Find the Max Depth 
	public int findMaxDepth(TreeNode node) {
		if(node==null) {
			return 0;
		}
		
		//Call recursion for left child
		int leftSide = findMaxDepth(node.leftChild);
		//Call recursion for right child
		int rightSide = findMaxDepth(node.rightChild);
		
		return 1+ Math.max(leftSide, rightSide);	
	}
	
	
}
