package com.puls.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarsExploration {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
		int cnt =0;
		
		char[] array = s.toCharArray();
		
		for(int i=0;i<array.length-2;) {
			
			char t = array[i];
			
			if(array[i]!='S') {
				cnt++;
			}
			if(array[i+1]!='O') {
				cnt++;
			}
			if(array[i+2]!='S') {
				cnt++;
			}
			
			i=i+3;
		}
    	
    	return cnt;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scanner.nextLine();

        int result = marsExploration("SOSSPSSQSSOR");

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
