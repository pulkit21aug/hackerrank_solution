package com.puls.hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WordInAstring {

    public static boolean containsHackerRank(String s) {
        boolean contains = false;
        char[] hackerrank = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        int index = 0;
        // Iterate through each character in hackerrank
        for (int i = 0; i < hackerrank.length; i++) {
            // Set contains to false
            contains = false;
            
            // Search for current char in the rest of the string
            while (index < s.length()) {
                // if found, break
                if (hackerrank[i] == s.charAt(index)) {
                    contains = true;
                    index++;
                    break;
                }
                // else, check next char
                else {
                    index++;
                }
            }
            // stop checking characters if current char doesn't exist in rest of string
            if (!contains) {
                return false;
            }
        }
        
        // Returns true if subsequence 'hackerrank' was found
        return contains;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            System.out.println((containsHackerRank(s)) ? "YES" : "NO");
        }
        in.close();
    }
}