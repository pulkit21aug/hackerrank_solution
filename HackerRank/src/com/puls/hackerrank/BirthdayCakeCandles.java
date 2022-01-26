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

class BirthdayCakeCandlesResult {

	/*
	 * Complete the 'birthdayCakeCandles' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY candles as parameter.
	 */

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
		// first find the maximum element in the list

		int max = candles.get(0);
		int maxCounter = 0;
        for (int i=0;i<candles.size();i++) {
        	if( max <= candles.get(i)) {
        		max = candles.get(i);
        	}
        }
		
        for (int i=0;i<candles.size();i++) {
        	if( candles.get(i) == max) {
        		maxCounter++;
        	}
        }

		return maxCounter;
	}

}

public class BirthdayCakeCandles {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = BirthdayCakeCandlesResult.birthdayCakeCandles(candles);
		System.out.print(result);

		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();

		bufferedReader.close();
		//bufferedWriter.close();
	}
}
