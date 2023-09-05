package com.hcl.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment {



	public static void main(String[] args) {

		Assignment obj = new Assignment();
		obj.listAvg();
		System.out.println("---------------------");
		obj.stringUpperLower();
		System.out.println("---------------------------");
		obj.removeDuplicate();
		System.out.println("---------------------------");
		obj.secondSmallLarge();

	}

	public void listAvg() {

		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		System.out.println(arr.stream().mapToInt(i -> i).average());

	}

	public void stringUpperLower() {

		List<String> arr = new ArrayList<String>();
		arr.add("Rithika");
		arr.add("Shiny");
		arr.add("athwika");
		arr.add("Kushal");
//		arr. stream (). filter (x -> x. startsWith ("a")).forEach(x->System.out.println(x + " "));
		
		System.out.println("Strings in upper case : ");
		arr.stream().map(names -> names.toUpperCase()).forEach(names -> System.out.println(names + " "));
		System.out.println("---------------------------");
		System.out.println("Strings in lower case :");
		arr.stream().map(names -> names.toLowerCase()).forEach(names -> System.out.println(names + " "));
	}

	public void removeDuplicate() {
		List<String> originalList = new ArrayList<>();
		originalList.add("A");
		originalList.add("B");
		originalList.add("C");
		originalList.add("C");
		originalList.add("B");
		originalList.add("A");
		originalList.add("D");
		originalList = originalList.stream().distinct().collect(Collectors.toList());
		System.out.println("Removed duplicates with java 8 api : " + originalList);

	}

	public void secondSmallLarge() {
		List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45);
		System.out.println("List of numbers: " + nums);
		Integer secondSmallest = nums.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		Integer secondLargest = nums.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst()
				.orElse(null);
		System.out.println("Second smallest element: " + secondSmallest);
		System.out.println("Second largest element: " + secondLargest);
	}
}
