import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyListTest {

	@Test
	void test1() {
		SinglyList list = new SinglyList();
		list.addAtFront(10);
		list.addAtRear(20);
		list.addAtFront(30);
		int[] expected = {30,10,20};
		
		assertArrayEquals(list.getElements(), expected);
	}

}
