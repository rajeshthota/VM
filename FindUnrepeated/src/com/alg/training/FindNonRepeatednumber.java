package com.alg.training;

import java.util.Arrays;

/*Given an integer array with each number repeated exactly once except one number.
 * find the number which is not repeated.
 * 
 * */
public class FindNonRepeatednumber {

	// Solving with XOR logic
	public static int findUnRepeated1(int a[]) {
		int result = 0;
		for (int i = 0; i < a.length; i++)
			result ^= a[i];
		return result;
	}

	// Solution using sorting
	public static int findUnRepeated2(int a[]) {
		int i;
		Arrays.sort(a);
		for (i = 0; i < a.length - 1; i+=2)
			if(a[i]!=a[i+1]) return a[i];
		return a[i];
	}
	
	// You write code for hash set based solution

}


