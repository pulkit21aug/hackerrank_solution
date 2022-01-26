import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {

	// Complete the caesarCipher function below.
	static String caesarCipher(String s, int k) {

		// Let char c = s[i] be a lowercase character in the string.
		k = k % 26;
		int c = 0;
		c += k;
		if (c > 122) {
			c = 96 + (c % 122);
		}

		// The range of uppercase characters is from 65 ('A') to 90 ('Z'). The range of
		// lowercase characters is from 97 ('a') to 122 ('z').
		return s;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int k = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String result = caesarCipher(s, k);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
