import java.io.*;
import java.util.*;

public class InsertDeleteInList {
   
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int capacity = sc.nextInt();
    	List<Integer> list = new ArrayList<>(capacity);
    	
    	// Addition of required element completed
    	for(int i=0;i<capacity;i++) {
    		int number = sc.nextInt();	
    		list.add(number);
    	}
    	int count = sc.nextInt();
    	int i =0;
    	while(i<count) {
        	switch(sc.next()) {
    		case "Insert" :
    			int index = sc.nextInt();
    			int number = sc.nextInt();
    			list.add(index,number);
    			break;
    		
    		case "Delete":
    			int index_ = sc.nextInt();
    			list.remove(index_);
        	}
        	++i;
    	}
    	//System.out.println("Elements added to list");
    	
    	sc.close();
    	Object[] out = list.toArray() ;
    	for(int j=0;j<out.length;++j) {
    		System.out.print(out[j]+" ");
    	}
    }
    	
}
