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

class BeautifulDaysattheMoviesResult {

	/*
	 * Complete the 'beautifulDays' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER i 2. INTEGER j 3. INTEGER k
	 */

	public static int beautifulDays(int i, int j, int k) {
		// Write your code here
		int res = 0;
		for (int cnt = i; cnt <= j; cnt++) {
			int revNumber = Integer.parseInt(reverseNumber(cnt));

			int diff = Math.abs(revNumber - cnt);

			float x = (float) diff / k;

			if ((x - Math.floor(x)) == 0) {
				res++;
			}
		}

		return res;

	}

	public static String reverseNumber(int i) {
		String str = Integer.toString(i);
		char[] charStr = str.toCharArray();
		StringBuffer buff = new StringBuffer();
		for (int k = charStr.length - 1; k >= 0; k--) {
			buff.append(charStr[k]);
		}
		return buff.toString();

	}

}

public class BeautifulDaysattheMovies {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int i = Integer.parseInt(firstMultipleInput[0]);

		int j = Integer.parseInt(firstMultipleInput[1]);

		int k = Integer.parseInt(firstMultipleInput[2]);

		int result = BeautifulDaysattheMoviesResult.beautifulDays(i, j, k);
		System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

		bufferedReader.close();
//        bufferedWriter.close();
	}
}
