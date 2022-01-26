import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FeadulentActivitySlidingArray {



	// Complete the activityNotifications function below.
	static int activityNotifications(int[] expenditure, int d) {

		int counter = 0;
		int len = expenditure.length;
		
		for (int i = 0; i <len- d; i++) {
			int[] tmp = new int[d];

			for (int j = i; j <len -d; j++) {
				// create temp array
				tmp[j] = expenditure[j];
			}

			Arrays.sort(tmp);
			int med = median(tmp);
			if (med < expenditure[i+len-d]) {
				counter++;
			}
		}

		return counter;

	}

	// the array double[] m MUST BE SORTED
	public static int median(int[] m) {
		int middle = m.length / 2;
		if (m.length % 2 == 1) {
			return m[middle];
		} else {
			return (int) ((m[middle - 1] + m[middle]) / 2.0);
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] expenditure = new int[n];

		String[] expenditureItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int expenditureItem = Integer.parseInt(expenditureItems[i]);
			expenditure[i] = expenditureItem;
		}

		int result = activityNotifications(expenditure, d);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
