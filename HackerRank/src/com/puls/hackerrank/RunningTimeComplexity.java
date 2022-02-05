package com.puls.hackerrank;

import java.io.*;
import java.util.*;

public class RunningTimeComplexity {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();

		for (int i = 0; i < testcase; i++) {
          System.out.println(getPrime(sc.nextInt())?"Prime":"Not prime");
		}

	}
	
	public static boolean getPrime(int n) {
	    if(n<2) {
	    	return false;
	    }
	    
	    for(int i=2;i*i<=n;i++) {
	    	if(n%i==0) {
	    		return false;
	    	}
	    }
	    
	    return true;
	}
}