package com.alg.training;

import java.util.Arrays;

public class TestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i, j;
		int[] a = new int[11];
		for(i = 1, j = 0; i <=5; ++i, j = j+2) {
			a[j] = i;
			a[j+1] = i;
		}
		a[j] = i; 
	    System.out.println(Arrays.toString(a));
	    
	    System.out.println(FindNonRepeatednumber.findUnRepeated1(a));
	    
	    System.out.println(FindNonRepeatednumber.findUnRepeated2(a));
		

	}

}
