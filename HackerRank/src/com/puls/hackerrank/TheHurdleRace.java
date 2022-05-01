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

class TheHurdleRaceResult {

	/*
	 * Complete the 'hurdleRace' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER k 2. INTEGER_ARRAY height
	 */

	public static int hurdleRace(int k, List<Integer> height) {
		// Write your code here
		int res = 0;
		// find max element in the array
		int max = height.get(0);

		for (int i = 1; i < height.size(); i++) {
			if (max < height.get(i)) {
				max = height.get(i);
			}
		}

		if (max > k) {
			res = max - k;
		}

		return res;

	}

}

public class TheHurdleRace {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int k = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = TheHurdleRaceResult.hurdleRace(k, height);
		System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

		bufferedReader.close();
//        bufferedWriter.close();
	}
}
