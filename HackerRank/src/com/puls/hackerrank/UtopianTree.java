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

class UtopianTreeResult {

	/*
	 * Complete the 'utopianTree' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts INTEGER n
	 * as parameter.
	 */

	public static int utopianTree(int n) {
		// Write your code here
		boolean summer = true;
		int height = 0;

		for (int i = 0; i <= n; i++) {
			if (summer == true) {
				height += 1;
				summer = false;
				continue;
			} else if (summer == false) {
				height = height * 2;
				summer = true;
				continue;
			}

		}

		return height;

	}

}

public class UtopianTree {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				int result = UtopianTreeResult.utopianTree(n);
				System.out.println(result);

				// bufferedWriter.write(String.valueOf(result));
				// bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
