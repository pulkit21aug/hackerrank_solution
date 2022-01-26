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

class PlusMinusResult {

	/*
	 * Complete the 'plusMinus' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		double pos = 0;
		double neg = 0;
		double n_zero = 0;

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				pos++;
			} else if (arr.get(i) == 0) {
				n_zero++;
			} else if (arr.get(i) < 0) {
				neg++;
			}
		}
		
		
		if( pos !=0) {
			System.out.format("%.6f", pos/arr.size());
			System.out.println();
		}else {
			System.out.format("%.6f", 0.0);
			System.out.println();
		}
		
		if( neg !=0) {
			System.out.format("%.6f", neg/arr.size());
			System.out.println();
			
		}else {
			System.out.format("%.6f", 0.0);
			System.out.println();
		}
		
		if( n_zero !=0) {
			System.out.format("%.6f", n_zero/arr.size());
		}else {
			System.out.format("%.6f", 0.0);
		}



	}

}

public class PlusMinus {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		PlusMinusResult.plusMinus(arr);

		bufferedReader.close();
	}
}
