import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ValidStringNotRepeat {

	// Complete the isValid function below.
	static String isValid(String s) {
		//
		int[] array = getCharCount(s);

		boolean flag = true;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 0 || array[i+1]==0) {
				continue;
			} else {
				if (array[i] != array[i + 1]) {
					int tmp1 = array[i];
					int tmp2 = array[i + 1];

					if (tmp1 > tmp2) {
						if ((tmp1 - 1) == tmp2) {
							continue;
						}
					} else {
						if (tmp1 == (tmp2 - 1)) {
							continue;
						}
					}

					flag = false;
					break;
				}
			}

		}

		if (flag) {
			return "YES";
		} else {
			return "NO";
		}

	}

	public static int[] getCharCount(String s) {
		int tmp[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			int offset = (int) 'a';
			int idx = c - offset;
			tmp[idx]++;

		}

		return tmp;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//		String s = scanner.nextLine();

		String result = isValid("abcdefghhgfedecba");
		System.out.print(result);
//
//		bufferedWriter.write(result);
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
//
//		scanner.close();
	}
}
