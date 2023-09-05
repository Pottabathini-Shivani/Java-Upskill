package com.hcl.assignment;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Assignment {
	
	public enum Month{JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER}

	public static void main(String[] args) {
		
		Assignment obj = new Assignment();
		obj.arrayList();
		obj.linkedList();
		obj.hashMap();
		obj.enumMonth();
	}
	
	public void arrayList() {
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(6);
		int sum = 0;
		for (Integer integer : arr) {
			sum = sum+integer;
		}
		System.out.println(sum);
	}
	
	public void linkedList() {
		
		List<String> arr = new LinkedList<String>();
		arr.add("Ganga");
		arr.add("Yamuna");
		arr.add("Narmada");
		System.out.println(arr);
		Collections.reverse(arr);
		System.out.println(arr);
	}
	
	public void hashMap() {
		Map<String,String> arr = new HashMap<String,String>();
		arr.put("Rithika","A");
		arr.put("Shiny","B");
		arr.put("Shivani","F");
		arr.put("Kushal", "C");
		System.out.println(arr);
		arr.remove("Shivani","F");
		System.out.println(arr);
	}
	
	    public  void enumMonth() {
	        for (Month m : Month.values()) {
	            System.out.println(m + " ");
	        }

	        int year = 2023;

	        try (Scanner sc = new Scanner(System.in)) {
	            System.out.println("Enter a month");
	            int month = sc.nextInt();

	            YearMonth yearMonth = YearMonth.of(year, month);
	            int daysInMonth = yearMonth.lengthOfMonth();

	            System.out.println("Number of days in " + yearMonth.getMonth() + ":" +daysInMonth);
	        }
	    }

}
