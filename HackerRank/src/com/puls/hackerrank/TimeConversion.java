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

class TimeConversionResult {

	/*
	 * Complete the 'timeConversion' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String timeConversion(String s) {
		// Write your code here
		// military conversion timee mm and ss can remain same - convert the hh as hh+12
		// first get two characters
		String hh_str = s.substring(0, 2); // this gives you hour
		String rst_str = s.substring(2, s.length());
		String res = null;
		int mil_hr = Integer.parseInt(hh_str);

		if (s.toLowerCase().contains("pm")) {
			if (mil_hr != 12) {
				mil_hr = 12 + Integer.parseInt(hh_str);
			}

			res = mil_hr + rst_str;
			res = res.toLowerCase().replace("pm", "");

		}

		if (s.toLowerCase().contains("am")) {

			if (mil_hr == 12) {
				res = "00" + rst_str;
			} else if (mil_hr <= 9) {
				res = "0" + mil_hr + rst_str;
			} else {
				res = mil_hr + rst_str;
			}

			res = res.toLowerCase().replace("am", "");

		}
		return res;

	}

}

public class TimeConversion {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String result = TimeConversionResult.timeConversion(s);
		System.out.print(result);

		// bufferedWriter.write(result);
		// bufferedWriter.newLine();

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
