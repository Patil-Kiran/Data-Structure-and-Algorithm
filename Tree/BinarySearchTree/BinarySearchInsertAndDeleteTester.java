
public class BinarySearchInsertAndDeleteTester {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(15);
		tree.insert(9);
		tree.insert(5);
		tree.insert(14);
		tree.insert(17);
		tree.insert(7);
		tree.insert(25);
		
		System.out.println("All the elements in Tree:");
		tree.inorderTraversal(tree.root);
		
		System.out.println("Total Depth Of Tree="+tree.findMaxDepth(tree.root));
	}

}
