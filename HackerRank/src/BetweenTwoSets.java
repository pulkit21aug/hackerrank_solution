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

class BetweenTwoSetsResult {

	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int getGCD(int x, int y) {
		if (y == 0) {
			return x;
		}
		return getGCD(y, x % y);
	}

	public static int getLCM(int x, int y) {
		if (x == 0 || y == 0)
			return 0;
		else {
			int gcd = getGCD(x, y);
			return Math.abs(x * y) / gcd;
		}
	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here
		int res = 0;

		// first get the LCM of all the numbers of first array
		int lcm = a.get(0);
		for (Integer tmp : a) {
			lcm = getLCM(lcm, tmp);
		}

		// get greatest common divisor of all elements of b
		int gcd = b.get(0);
		for (Integer tmp : b) {
			gcd = getGCD(gcd, tmp);
		}

		// now find multiples of lcm and increment result for which muliple mod gcd is
		// zero

		int multiple = 0;
		while (multiple <= gcd) {
			multiple += lcm;
			if (gcd % multiple == 0) {
				res++;
			}
		}

		return res;
	}

}

public class BetweenTwoSets {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = BetweenTwoSetsResult.getTotalX(arr, brr);

		bufferedWriter.write(String.valueOf(total));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
