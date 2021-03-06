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

public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
     Integer[]  ctresults = new Integer[2];
     ctresults[0]=0;
     ctresults[1]=0;
     
     
     //assumption that both player have played same number of matches 
     if(a.size() != b.size()) {
    	 System.out.println("Not same score");
    	 System.exit(1);
     }
     
     for(int i=0;i<a.size();i++) {
    	 if(a.get(i) > b.get(i)) {
    		 ctresults[0] = ctresults[0]+1;
    	 }
    	 if(a.get(i) < b.get(i)) {
    		 ctresults[1] = ctresults[1]+1;
    	 }
     }
     
     return Arrays.asList(ctresults);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
