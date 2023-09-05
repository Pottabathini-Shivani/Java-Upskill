package com.hcl.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		for (Integer integer : arr) {
			if(integer % 2 == 0) {
				continue;
			}
			System.out.println(integer);
		}
		
		List<Object> array = new ArrayList<Object>();
		array.add("abc");
		array.add(2);
		array.add(arr);	
		
		
	}
	
//	public void mess(){
//		System.out.println("abc");
//	}
//	
//	
//	public void mess(int a) {
//		System.out.println("dcf");
//	}
}


