import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("serial")
class StackErrorException extends Exception {
	public StackErrorException(String msg) {
		super(msg);

	}
}

class StackUsingArray {
	private int top;
	private char[] stack;
	private String str;
	private int n;

	public StackUsingArray(String str) {
		this.str = str;
		this.n = str.length();
		stack = new char[n];
		this.top = -1;
	}

	public boolean isEmpty() {
		if (top == -1) {
			// System.out.println("Stack is empty");
			return true;
		}
		return false;
	}

	public void push(char str) throws Exception {
		try {
			if (isFull()) {
				throw new StackErrorException("Stack is Full !!");
			}
			++top;
			stack[top] = str;
			// System.out.println("Element Added = "+Arrays.toString(stack));
		} catch (Exception e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

	public char pop() throws Exception {

		try {
			if (isEmpty()) {
				throw new StackErrorException("Stack is Empty !!"); //// Using Exception(String message)
			}
			char element = stack[top];
			--top;
			// System.out.println("Element Removed = " + element);
			return element;
		} catch (Exception e) {
			// RuntimeException-->JVM looks in runtime anyone who's throwing exception but
			// RuntimeException extended from Exception
			// has access to all methods of Exception class but methods are not overriden in
			// child class and hence it cannot print anything !!
			// and program terminates here without returning 0 !!! out-->[4,3,2,1,5];
			// System.out.println(e.getMessage());

			// Here Exception class --> returns 0 --> final output -->[4,3,2,1,0]
			// System.out.println(e.getMessage()); // Index Out of Bound message due to
			// Exception--> IndexOUt-->ArrayIndexOut --
			e.printStackTrace();

		}
		return 0;
	}

	public boolean isFull() {
		if (top == n - 1) {
			// System.out.println("Stack is Full");
			return true;

		} else {
			return false;
		}

	}

}

public class BalancedParentheses {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String {([]})");
		while (sc.hasNext()) {
			if (BalancedParentheses.isBalanced(sc.nextLine())) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}

	public static boolean isBalanced(String s) throws Exception {
		boolean flag_1 = true, flag_2 = true, flag_3 = true;
		StackUsingArray stack = new StackUsingArray(s);
		int i = 0;
		boolean flag = true;
		while (i < s.length()) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));

			} else {
				if (stack.isEmpty()) {
					flag = false;
					return false;
				}

				switch (s.charAt(i)) {

				case ')':
					if (stack.pop() == (int) '(') {
						flag_1 = true;
						// System.out.println(flag_1);
					} else {
						return false;
					}
					break;

				case '}':
					if (stack.pop() == (int) '{') {
						flag_2 = true;
					} else {
						return false;
					}
					break;

				case ']':
					if (stack.pop() == (int) '[') {
						flag_3 = true;
					} else {
						return false;
					}
					break;

				default:
					flag = false;
					// System.out.println("def"+flag);
				}

				// System.out.println("out "+flag);
				flag = flag && flag_1 && flag_2 && flag_3;
			}

			++i;
		}
		if (stack.isEmpty() == false) {
			return false;
		}
		// System.out.println("flag final ="+flag);
		return flag;
	}

}
