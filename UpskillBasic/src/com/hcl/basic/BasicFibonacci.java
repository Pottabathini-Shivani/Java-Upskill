package com.hcl.basic;

import java.util.Scanner;

public class BasicFibonacci {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the limit of fibonacci series:");
			int n = sc.nextInt();
			BasicFibonacci obj = new BasicFibonacci();
			obj.fibonacci(n);
			int fib[] = obj.fib(n);
			for (int i : fib) {
				System.out.print(i + " ");
			}
		}
	}

	public void fibonacci(int n) {

		int count = 1;
		int f = 0;
		int s = 1;
		System.out.print(f + " " + s + " ");
		while (count <= n - 2) {
			int res = s + f;
			System.out.print(res + " ");
			f = s;
			s = res;
			count++;
		}
		System.out.println();

	}

	public  int[] fib(int num) {
        int fibSum[] = new int[num];
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                fibSum[i] = i;
                continue;
            }

            if (i == 1 || i == 2) {
                fibSum[i] = 1;
                continue;
            }

            fibSum[i] = fibSum[i - 1] + fibSum[i - 2];

        }
        return fibSum;
    }
}
