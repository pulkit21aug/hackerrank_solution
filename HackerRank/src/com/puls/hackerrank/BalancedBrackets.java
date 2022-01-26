package com.puls.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {

	// Complete the isBalanced function below.
	static String isBalanced(String s) {
//		char[] tmp = {')',']','}'};

		boolean isBal = true;

		char array[] = s.toCharArray();
		Stack stk = new Stack();

		for (int i = 0; i < array.length; i++) {
			char c = array[i];

			if (c == '{' || c == '[' || c == '(') {
				stk.push(c);
			} else {
				
				if(stk.isEmpty()) {
					return "NO";
				}
				char tmp = (char) stk.pop();

				if (c != '}' && tmp == '{') {
					isBal = false;
					break;
				} else if (c != ')' && tmp == '(') {
					isBal = false;
					break;
				} else if (c != ']' && tmp == '[') {
					isBal = false;
					break;
				}
			}

		}

		if (isBal) {
			return "YES";
		} else {
			return "NO";
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int t = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		for (int tItr = 0; tItr < t; tItr++) {
//			String s = scanner.nextLine();

		String result = isBalanced("}][}}(}][))]");
//
//			bufferedWriter.write(result);
//			bufferedWriter.newLine();
//		}
//
//		bufferedWriter.close();
//
//		scanner.close();
	}
}
