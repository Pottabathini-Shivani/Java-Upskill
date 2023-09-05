package com.hcl.practice;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
//		List<Integer> exg = new ArrayList<Integer>();
//		exg.add(1);
//		exg.add(2);
//		System.out.println(exg);
//		List<Object> obj = new ArrayList<Object>();
//		obj.add(1);
//		obj.add("exg");
//		System.out.println(obj);
		String s1 = "Abc";
		String s2 = "Abc";
		String s3 = new String("Abc");
		String s4 = new String("Abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
	}
}
