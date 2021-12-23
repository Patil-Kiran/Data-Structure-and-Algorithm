import java.util.Arrays;

public class MainTested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyList list = new SinglyList();
		list.addAtFront(10);
		list.addAtRear(20);
		list.addAtFront(30);
		
		System.out.println(Arrays.toString(list.getElements()));
	}

}
