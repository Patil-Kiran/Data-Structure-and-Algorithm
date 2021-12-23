import java.util.Arrays;

import custom_exception.StackErrorException;

import java.lang.Exception;

public class StackUsingList implements StackInterface {
	private SinglyList stack;
	
	
	public StackUsingList() {
		stack = new SinglyList() ;
	
	}
	
	@Override
	public boolean isEmpty() {
		if(stack.getCount()==0) {
			//System.out.println("Stack is empty");
			return true;
		}
		return false;
	}
	


	@Override
	public void push(int element) throws Exception  {
		try {
			if(isFull()) {
				throw new StackErrorException("Stack is Full !!");
			}  // Never Going to full // Shrinkable
			
			stack.addAtFront(element);
			System.out.println("Element Added = "+Arrays.toString(stack.getElements()));
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();

		}
		
	}

	@Override
	public int pop() throws Exception {

		try {
			if (isEmpty()) {
				throw new StackErrorException("Stack is Empty !!"); //// Using Exception(String message)
			}
			int element = stack.deletFirstNode();
			System.out.println("Element Removed = " + element);
			return element;
		} catch (Exception e) {
			//RuntimeException-->JVM looks in runtime anyone who's throwing exception but RuntimeException extended from Exception 
			// has access to all methods of Exception class but methods are not overriden in child class and hence it cannot print anything !!
			// and program terminates here without returning 0 !!! out-->[4,3,2,1,5];
			//System.out.println(e.getMessage());
			
			// Here Exception class --> returns 0 --> final output -->[4,3,2,1,0]
			System.out.println(e.getMessage()); // Index Out of Bound message due to Exception--> IndexOUt-->ArrayIndexOut --
			
		}
		return 0;
	}

	@Override
	public boolean isFull() {
		return false;
	}

}