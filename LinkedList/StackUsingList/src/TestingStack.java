import java.util.Arrays;

public class TestingStack extends Exception {
	
	public static void reverseArray(int[] element, StackUsingList stack) {
		try {
			for(int i=0;i<element.length;i++) {
				stack.push(element[i]);
			}
			
			for(int i=0;i<=element.length;i++) {
				element[i]=stack.pop();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5}; 
		
		System.out.println(Arrays.toString(arr));
		// Create instance of Class StackUsingArray
		StackUsingList stackObject = new StackUsingList() ;
		// Passing 10 element to array !!!
		reverseArray(arr, stackObject);
		System.out.println(Arrays.toString(arr));
	}

}
