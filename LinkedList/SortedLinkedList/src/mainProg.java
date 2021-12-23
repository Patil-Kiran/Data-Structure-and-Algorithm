import java.util.Arrays;

public class mainProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedLinkedList l = new SortedLinkedList();
		l.insert(20);
		l.insert(10);
		l.insert(20);
		l.insert(1);
		l.insert(5);
		l.delete(1);
		System.out.println(Arrays.toString(l.getElements()));
		
		SortedLinkedList l1 = new SortedLinkedList();
		l1.insert(2);
		l1.insert(14);
		l1.insert(17);
		l1.insert(65);
		l1.delete(17);
		l1.insert(12);
		System.out.println(Arrays.toString(l1.getElements()));
	}

}
