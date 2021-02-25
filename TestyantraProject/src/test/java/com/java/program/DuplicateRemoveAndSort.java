package com.java.program;

import java.util.TreeSet;

public class DuplicateRemoveAndSort {

	public static void main(String[] args) {
		
		
		int[] arr= {1,8,2,9,6,3,3,2,1};
		
		TreeSet<Integer> set= new TreeSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			
		}
		
		for (Integer integer : set) {
			
			System.out.println(integer);
		}
		
				
				
		
		

	}

}
