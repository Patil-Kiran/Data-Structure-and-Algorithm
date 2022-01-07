package com.app.Recursion;

import java.util.ArrayList;
import java.util.List;

public class ArrayProductSum {
	
	static int productSum(List<Object> list , int depth) {
		// use for for each to iterate
		int sum =0;
		for(Object o:list) {
			if(o instanceof List) {
				// If Object is Instance of List
				// i.e. List within List !!!!
				sum += productSum((List<Object>) o, depth+1);
				System.out.println("Sum1 ="+sum);
			}else {
				// if it belongs to other Non Primitive Data type 
				sum += (int) o;
				System.out.println("Sum 2="+sum);
			}
		}
		System.out.println("final before return ="+sum*depth);
		return sum*depth;
	}
		
	public static void main(String[] args) {
		List<Object> a1 = List.of(3,4);
		//System.out.println(a1);
		List<Object> a2 = List.of(4,5);
		List<Object> a3 = List.of(a2,6);
		List<Object> array = List.of(1,2,a1,a3,7);
		System.out.println(array);
		
		int sum = productSum(array, 1);
		System.out.println("Sum Of Elements = "+sum);
	}
	

}
