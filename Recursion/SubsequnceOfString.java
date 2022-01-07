package com.app.Recursion;

import java.util.Arrays;

public class SubsequnceOfString {
	static int count =0;
	public static String getSubsequences(String str) {
		if(str.isEmpty()) {
			return "";
		}
		// Finding first Character
		char first = str.charAt(0);
		System.out.println("first ="+first);
		//Starting from next letter making recursive call !!!! 
		String remainingString = getSubsequences(str.substring(1));
		System.out.println("Remaining String ="+remainingString +"   ------count="+(++count));
		// During Recursive Call we Function calls First variable 
		// resp we'll get (abc)--->a(bc)--->ab(c)-->abc("")--->empty
		System.out.println(Arrays.toString(remainingString.split(",", -1)));
		String result = "";
		for(String sub:remainingString.split(",", -1)) {
			result +=","+first +sub;
			System.out.println("First Result ="+result);
			result +=","+sub;
			System.out.println("Second Result ="+result);
		}
		return result.substring(1);
		
	}
	public static void main(String[] args) {
		String str = "abc";
		String sub = getSubsequences(str);
		System.out.println(sub);
	}

}
