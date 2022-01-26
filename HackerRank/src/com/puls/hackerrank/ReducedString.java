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

public class ReducedString {

	// Complete the superReducedString function below.
	static String superReducedString(String s) {

	// Use stack implementation 
		
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < s.length() -1 ; i++) {
			char x = s.charAt(i);
			char y = s.charAt(i + 1);
			if (x == y) {
				continue;
			} else {
				sb.append(x);
			}
		}

		String str = sb.toString();
		if (str.isEmpty()) {
			return "EMPTY STRING";
		} else {
			return str;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = bufferedReader.readLine();

		String result = superReducedString(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
