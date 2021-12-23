
public class SortedLinkedList {
	Node head ;
	//Node tail; not required !!
 	
	public SortedLinkedList() {
		this.head = null;
	}
	
	public void insert(int element) {
		// make space
		// set data and next to null
		Node newNode = new Node(element);
		// if list empty
		if(head==null) {
			head = newNode;
			//Stop
			return ;
		}
		// Set current to head traversal
		Node current = head;
		Node previous =null;
		// while loop current ! empty
		while(current != null) {
			//if(current.data>element)
			if(current.data>element) {
				// end the traversal
				// This is step to identify smallest number and accordingly to shift in list
				//After this control goes to line no.40
				break;
			}
			// set prrvious to current 
			// set current to current.next
			previous = current;
			current = current.next;
		}
		//Adding before first node 
		// if current is first node
		if(current==head) {
			// set newnode's next head
			newNode.next = head;
			head = newNode;
			//stop;
			return ;
		}
		
		//Adding after lastNode
		// if current is empty after traversal it reached end
		if(current==null) {
			//set previous.next = newNode;
			previous.next = newNode;
			//stop 
			return ;
		}
		// Insert newNode bet prev and current
		previous.next = newNode;
		newNode.next = current;
	}
	//Delete a Node
	
	public void delete(int element) {
		// if List is Empty --> Optimized
		Node prev = null;
		Node current = head;
		while(current !=null) {
			//check whether element present or  not
			if(current.data==element) {
				//if present do not stop loop it will switched to lineno 78
				break ;
			}
			// if not found then need to update current and thereby prev also
			prev = current;
			current = current.next;
		}
		//set prev =current and current = current.next
		
		//delet first node
		// If element found and if it is at first node then current will carry it's ref
		// if current.data==head.data == firstnode
		if(current==head) { 
			// De-Linking
			head = head.next; // Updating head to next  
			return ;
		}
		// If element not present  or either list empty both condition handled
		if(current==null) {
			System.out.println("Element not Found");
			return;
		}
		
		// if element found in traversal and it is not at first node
		// then it found by udating current ref and hence now current pointing to that node
		// so current ---> node to be removed prev.next  points to current.next 
		prev.next =current.next ;// Same if element found at last	
		
		return ;
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
			++i;
			current = current.next;
		}
		return elements;
	}
}
