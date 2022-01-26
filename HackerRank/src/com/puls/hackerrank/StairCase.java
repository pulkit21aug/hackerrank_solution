package com.puls.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class StairCaseResult {

	/*
	 * Complete the 'staircase' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void staircase(int n) {
		// Write your code here
		for (int i = 1; i <=n; i++) {
			String res = getPadded(n-i,i);
			System.out.println(res);
		}
	}

	public static String getPadded(int n,int k) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			sb.append(" ");
		}
		for(int t=0;t<k;t++) {
			sb.append("#");
		}
		
		return sb.toString();
	}

}

public class StairCase {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		StairCaseResult.staircase(n);

		bufferedReader.close();
	}
}
