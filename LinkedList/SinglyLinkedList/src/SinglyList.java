
public class SinglyList {
	Node head ;
	Node tail;
	
	// constructor
	public SinglyList() {
		this.head =null;
		this.tail=null;
	}
	
	public void addAtFront(int element) {
		//Unoptimised
		// List --> "Has a Node" ---> "Association
		// Every time adding new element --> Make Space by adding new node 
		Node newNode;
		newNode = new Node(element) ;
		
//		newNode.data = element; ---> dir initialise constructor of node !!
//		newNode.next =null;
		
		//If List is Empty
		if(this.head==null) {
			head = newNode;
			tail = newNode;
			return ; // 
		}
		
		// If List not empty now head and tail has it's ref 
		newNode.next = head;  // previous ref of head --> old element linked with new one
		// head gets updated with addition of new element --> head pointing to first element
		head = newNode;	
	}
	
	public void addAtRear(int element) {
		Node newNode;
		newNode  = new Node(element);
		newNode.next = tail; 
		if(head==null) {
			head = newNode;
			tail = newNode;
			return ; // Stop 
		}
		// Adding at rear happens on tail ref of Node 
		// tail.next responsible for keeping ref new elements
		tail.next = newNode;
		// finally tail got updated with ref of current node aka newNode
		tail = newNode;
	}
	
	
	public int getCount() {
		int count =0;
		Node current ;
		current =head ;
		while(current != null ) {
			++count;
			current = current.next;
		}
		return count;
	}
	
	public int[] getElements() {
		int[] elements = new int[getCount()];
		Node current ;
		current =head;
		int i=0;
		while(current !=null) {
			elements[i] = current.data;
			current=current.next;
			++i;
		}
		return elements;
	}
	
	// Remove element at Front
	
	public int deletFirstNode() {
		Node temp = head ;
		// to update head ref to next element
		// if we're only updating  head = temp.next this will work !!!
		head = head.next ;
		if(head==null) {
			tail =null;
		}
		return temp.data;
	}
	

		
	
}
