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

class SolvRepeatableCharString {

	/*
	 * Complete the 'repeatedString' function below.
	 *
	 * The function is expected to return a LONG_INTEGER. The function accepts
	 * following parameters: 1. STRING s 2. LONG_INTEGER n
	 */

	public static long repeatedString(String s, long n) {
		// Write your code here

		long res = 0;
		long aFeqIn = getFreqInSingleString(s);
		long numOfRep = getNumOfRepetition(s, n);
		res += aFeqIn * numOfRep;

		long remainChar = getNumOfCharNotInFullString(s, n);

		for (int i = 0; i < remainChar; i++) {
			if (s.charAt(i) == 'a') {
				res += 1;
			}
		}
		return res;

	}

	public static long  getFreqInSingleString(String s) {
		int len = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				len++;
			}
		}
		return len;

	}

	public static long  getNumOfRepetition(String s, long n) {
		return n / s.length();
	}

	public static long getNumOfCharNotInFullString(String s, long n) {
		return  n % s.length();
	}
}

public class RepeatbaleCharInString {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		long n = Long.parseLong(bufferedReader.readLine().trim());

		long result = SolvRepeatableCharString.repeatedString(s, n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
