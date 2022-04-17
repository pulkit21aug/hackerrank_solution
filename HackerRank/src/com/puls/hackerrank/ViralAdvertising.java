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

class ViralAdvertisingResult {

	/*
	 * Complete the 'viralAdvertising' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts INTEGER n
	 * as parameter.
	 */

	public static int viralAdvertising(int n) {
		// Write your code here
		int shared = 5;
		int likes = (int) Math.floor(shared / 2);
		int cumLikes = likes;

		for (int i = 1; i < n; i++) {
			shared = likes * 3;
			likes = (int) Math.floor(shared / 2);
			cumLikes += likes;
		}
		return cumLikes;

	}

}

public class ViralAdvertising {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		int result = ViralAdvertisingResult.viralAdvertising(n);
		System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
