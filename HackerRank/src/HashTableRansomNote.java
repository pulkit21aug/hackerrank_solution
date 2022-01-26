import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HashTableRansomNote {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {

		HashMap<String, String> map = new HashMap<String, String>();
		boolean res = true;

		for (String str : magazine) {
			map.put(str, str);
		}

		for (String str : note) {
			String key = str;
			String tmp = map.get(key);
			if (tmp == null) {
				res = false;
				break;
			} else {
				map.remove(key);
			}

		}

		if (res)
			System.out.print("Yes");
		else
			System.out.print("No");
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
