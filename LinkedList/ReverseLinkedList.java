
class Node {
	// Node has data and ref of next element ;
	int data;
	Node next;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
	}

	public Node(int element, Node next) {
		this.data = element;
		this.next = next;
	}

	public static void print(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static Node reverseLinkedList(Node head) {
		// if list is empty // list not exists
		if (head == null) {
			return null;
		}
		// for non empty list create temp var to keep track of head node
		Node temp = null;
		// Node current = head;
		// traverse till head not null // CONSTANT HEAD APPROACH will not work

		while (head != null) {
			Node next = head.next;
			head.next = temp;
			temp = head;
			// head = head.next; // head.next ---> right associative -->intially temp ==null
			// --> head.next---> null---- head ---> null loop terminate
			head = next; // but next contains original value !!!

		}

		Node.print(temp);
		return temp;

	}

	public static void main(String[] args) {
		// Node n0 = new Node();
		Node n1 = new Node(10);// --> list 10 , n1.next-->null
		Node n2 = new Node(20, n1);// ---> 20,10
		Node n3 = new Node(30, n2); // 30,20,10
		Node n4 = new Node(40, n3);// 40,30,20,10
		Node n5 = new Node(50, n4); // 50,40,30,20,10
		Node n6 = new Node(60, n5); // 60 ,40,30,20,10
		Node.print(n6);
		Node.print(n5);
		Node.print(n4);
		Node.print(n3);
		Node.print(n2);
		Node.print(n1);
		Node.reverseLinkedList(n6); // --> 10,20,30,40,50,60

	}
}
