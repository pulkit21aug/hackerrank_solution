import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringAnagrams {

	// Complete the makeAnagram function below.
	static int makeAnagram(String a, String b) {

		int[] array1 = getCharCountArray(a);
		int[] array2 = getCharCountArray(b);
		int cnt = 0;

		if (array1.length != array2.length) {
			return -1;
		}
		for (int i = 0; i < array1.length; i++) {
			int diff = Math.abs(array1[i] - array2[i]);
			cnt += diff;

		}

		return cnt;

	}

	public static int[] getCharCountArray(String a) {
		int[] tmp = new int[26];
		for (int i = 0; i < a.length(); i++) {
			int s = a.charAt(i);
			int offset = (int) 'a';
			int idx = s - offset;
			tmp[idx]++;

		}
		return tmp;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String a = scanner.nextLine();

		String b = scanner.nextLine();

		int res = makeAnagram(a, b);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
