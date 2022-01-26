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

class NumberLineJumpsResult {

	/*
	 * Complete the 'kangaroo' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER x1 2. INTEGER v1 3. INTEGER x2 4. INTEGER v2
	 */

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		// Write your code here
		// the logic first the velocity difference between v2 and v1 should non-negative

		// as per mathematics algebra distance for both kangaroos should be same
		// x1 + v1*j = x2 +v2*j --solve the equation for j i.e number of hops
		// (v1-v2)*j = x2 - x1

		String str = "NO";
		if (v1 > v2) {
			int xdiff = x2 - x1;
			int vdiff = v1 - v2;

			if (xdiff % vdiff == 0) {
				str = "YES";
			}
		}

		return str;
	}

}

public class NumberLineJumps {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int x1 = Integer.parseInt(firstMultipleInput[0]);

		int v1 = Integer.parseInt(firstMultipleInput[1]);

		int x2 = Integer.parseInt(firstMultipleInput[2]);

		int v2 = Integer.parseInt(firstMultipleInput[3]);

		String result = NumberLineJumpsResult.kangaroo(x1, v1, x2, v2);
		System.out.print(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

		bufferedReader.close();
//        bufferedWriter.close();
	}
}
