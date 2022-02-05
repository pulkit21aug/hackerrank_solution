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

class BreakingTheRecordsResult {

	/*
	 * Complete the 'breakingRecords' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY scores as parameter.
	 */

	public static List<Integer> breakingRecords(List<Integer> scores) {
		// Write your code here
		Integer[] ar = new Integer[2];
		int min = scores.get(0);
		int max = scores.get(0);
		int cntMin = 0;
		int cntMax = 0;

		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) < min  ) {
				min = scores.get(i);
				cntMin++;
			}

			if ( scores.get(i) > max) {
				max = scores.get(i);
				cntMax++;
			}
		}

		ar[0] = cntMax;
		ar[1] = cntMin;
		return Arrays.asList(ar);

	}

}

public class BreakingTheRecords {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> result = BreakingTheRecordsResult.breakingRecords(scores);
		System.out.print(result);

		//bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
		//bufferedWriter.close();
	}
}
