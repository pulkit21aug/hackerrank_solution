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

class SavethePrisonerResult {

	/*
	 * Complete the 'saveThePrisoner' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER m 3. INTEGER s
	 */

	public static int saveThePrisoner(int n, int m, int s) {

		// determine the number of chocolates each prisoner will get equally and get the
		// remainder
		int r = m % n;

		// now let us say if the base value was 1 i.e. chocolate distribution started
		// from 1 but in our case it is s
		int tmp = (r + s - 1) % n;

		if (tmp == 0) {
			// all chocolates distributed equally and last will be n
			return n;
		} else {
			return tmp;
		}

	}

}

public class SavethePrisoner {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				int n = Integer.parseInt(firstMultipleInput[0]);

				int m = Integer.parseInt(firstMultipleInput[1]);

				int s = Integer.parseInt(firstMultipleInput[2]);

				int result = SavethePrisonerResult.saveThePrisoner(n, m, s);
				System.out.println(result);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}
}
