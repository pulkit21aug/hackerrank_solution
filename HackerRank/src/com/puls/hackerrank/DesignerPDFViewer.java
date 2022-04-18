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

class DesignerPDFViewerResult {

	/*
	 * Complete the 'designerPdfViewer' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY h 2. STRING word
	 */

	public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    	int res=0;
    	
    	char[] arr = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    	
    	char[] wordarr = word.toCharArray();
    	int maxHeight=1;
    	
    	for(int i=0;i<word.length();i++) {
    		for(int j=0;j<arr.length;j++) {
    			if(wordarr[i] ==arr[j]) {
    				int tmp = h.get(j);
    				if(maxHeight < tmp) {
    					maxHeight = tmp;
    				}
    			}
    		}
    	}
    	
    	res = maxHeight * 1 * word.length();
    	
    	return res;

    }

}

public class DesignerPDFViewer {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		String word = bufferedReader.readLine();

		int result = DesignerPDFViewerResult.designerPdfViewer(h, word);
		System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
