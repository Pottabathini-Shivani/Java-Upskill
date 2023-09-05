package com.hcl.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exam {

	public static void main(String[] args) {
	
		Set<Integer> arr = new HashSet<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		System.out.println(arr);
		Map<Integer, Integer> array = new HashMap<Integer, Integer>();
		array.put(1, 1);
		array.put(2,44);
		array.put(3, 66);
		System.out.println(array);
		
		List<Integer> i = new ArrayList<Integer>();
		i.add(22);
		i.add(23);
		i.add(4);
		for (Integer integer : i) {
			if(integer%2 == 0) {
				System.out.println(integer);
			}
		}
		
	}
	
//	(int a, int b)->{return (a+b};
}
