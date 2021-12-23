import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedLinkedListTest {

	@Test
	void test() {
		SortedLinkedList l = new SortedLinkedList();
		l.insert(2);;
		l.insert(45);
		l.insert(37);
		l.insert(34);
		int[] expected = {2,34,37,45};
		assertArrayEquals(l.getElements(),expected);
	}
	@Test
	void test1() {
		SortedLinkedList l = new SortedLinkedList();
		l.insert(2);;
		int[] expected = {2};
		assertArrayEquals(l.getElements(),expected);
	}
	@Test
	void test3() {
		SortedLinkedList l = new SortedLinkedList();
		l.insert(2);;
		l.insert(45);
		int[] expected = {2,45};
		assertArrayEquals(l.getElements(),expected);
	}
	@Test
	void test4() {
		SortedLinkedList l = new SortedLinkedList();
		l.insert(2);
		l.insert(1);
		int[] expected = {1,2};
		assertArrayEquals(l.getElements(),expected);
	}
	
	@Test
	void test5() {
		SortedLinkedList l = new SortedLinkedList();
		l.insert(2);
		l.insert(45);
		l.delete(12);
		int[] expected = {2,45};
		assertArrayEquals(l.getElements(),expected);
	}
	
	@Test
	void test6() {
		SortedLinkedList l = new SortedLinkedList();
		l.insert(2);
		l.insert(14);
		l.insert(17);
		l.insert(65);
		l.delete(17);
		l.insert(12);
		int[] expected = {2,12,14,65};
		assertArrayEquals(l.getElements(),expected);
	}
	
	@Test
	void test7() {
		SortedLinkedList l = new SortedLinkedList();
		l.insert(2);;
		int[] expected = {2};
		assertArrayEquals(l.getElements(),expected);
	}	
}
