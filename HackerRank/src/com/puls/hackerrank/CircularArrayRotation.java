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

import com.sun.tools.javac.code.Attribute.Array;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CircularArrayRotationResult {

	/*
	 * Complete the 'circularArrayRotation' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY a 2. INTEGER k 3. INTEGER_ARRAY
	 * queries
	 */

	public static void swap(List<Integer> a, int left, int right) {
		while (left < right) {
			int tmp = a.get(left);
			a.set(left, a.get(right));
			a.set(right, tmp);
			left++;
			right--;
		}

	}

	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

		/**
		 * Alogorithm Swap numbers using 2 pointer system from left and right index of
		 * the Array Array will be partitioned into 2 sets from kth index and then
		 * entire array will be rotated
		 */
		List<Integer> res = new ArrayList<Integer>();

		if (k > a.size()) {
			// if k is greater the array size then after a.size rotation we will get the
			// original array
			// so take the remainder and do the rotation
			k = k % a.size();
		}

		swap(a, 0, a.size() - k - 1);
		swap(a, a.size() - k, a.size() - 1);
		swap(a, 0, a.size() - 1);

		for (int i = 0; i < queries.size(); i++) {
			res.add(a.get(queries.get(i)));
		}

		return res;
	}

}

public class CircularArrayRotation {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		int q = Integer.parseInt(firstMultipleInput[2]);

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> queries = IntStream.range(0, q).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		List<Integer> result = CircularArrayRotationResult.circularArrayRotation(a, k, queries);
		System.out.println(result);

//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//            + "\n"
//        );

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
