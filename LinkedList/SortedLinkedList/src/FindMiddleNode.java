import java.util.Arrays;

public class FindMiddleNode extends SortedLinkedList{

	public FindMiddleNode() {
		super();
	}
	
	public static void main(String[] args) {
		FindMiddleNode list = new FindMiddleNode();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		 // print output when count even 
		System.out.println("List Elements = "+Arrays.toString(list.getElements())+" , Middle Node Value = "+list.findMiddleNode().data);
		
		list.insert(50);
		// print output when count odd
		System.out.println("List Elements = "+Arrays.toString(list.getElements())+" , Middle Node Value = "+list.findMiddleNode().data);
		
		
	}
	
	public Node findMiddleNode() {
		Node slow = head;
		Node prev = null;
		Node fast = head ;
		// Traverse Through list
		while(fast != null && fast.next !=null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast==null ) {
				
				return prev; // Even value--->[1,2,3,4] ---> o/p--> 2 prior to middle
			}
		}
		return slow; // Odd count ---> [1,2,3,4,5] --> output ---> 3
	}
}
