package com.hcl.basic;

import java.util.Scanner;

public class BasicPalindrome {

	public static void main(String[] args) {
		
		BasicPalindrome obj = new BasicPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		obj.palindrome(n);
	}
	
	public void palindrome(int n) {
		
		int i=0,temp = n,res=0,sum = 0;
		while(n!=0) {
			res = n%10;
			sum = (sum*10)+res;
			n=n/10;	
		}
		System.out.println(sum);
		if(temp == sum) {
			System.out.println("Number is a palindrome");
		}else {
			System.out.println("Number is not a palindrome");
		}
	}
}
