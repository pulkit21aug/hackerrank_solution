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

class MigratoryBirdsResult {

	/*
	 * Complete the 'migratoryBirds' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 */

	public static int migratoryBirds(List<Integer> arr) {
		int[] birds = new int[5];

		for (int i = 0; i < arr.size(); i++) {
			birds[arr.get(i) - 1]++;
		}

		int max = 0;
		int id = 0;
		for (int i = 0; i < 5; i++) {
			if (birds[i] > max) {
				max = birds[i];
				id = i + 1;
			}
		}
		return id;
	}

}

public class MigratoryBirds {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = MigratoryBirdsResult.migratoryBirds(arr);
		System.out.print(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
