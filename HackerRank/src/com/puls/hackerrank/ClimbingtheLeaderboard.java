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

class ClimbingtheLeaderboardResult {

	/*
	 * Complete the 'climbingLeaderboard' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY ranked 2. INTEGER_ARRAY player
	 */

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
		// Write your code here

		int[] score = ranked.stream().mapToInt(Integer::intValue).toArray();

		int[] rank = new int[ranked.size()];

		int[] alice_score = player.stream().mapToInt(Integer::intValue).toArray();
		int[] alice_rank = new int[player.size()];
		// step-1 build the rank array

		rank[0] = 1; // ranked list is in decreasing order so first rank will be 1
		// build the rank array based on the scores of the player who have scores in the
		// ranked list

		for (int i = 1; i < score.length; i++) {
			if (score[i] == score[i - 1]) {
				rank[i] = rank[i - 1];
			} else {
				rank[i] = rank[i - 1] + 1;
			}
		}

		int lenAliceScore = alice_score.length;
		int lenScore = score.length;

		for (int i = 0; i < lenAliceScore; i++) {
			if (alice_score[i] > score[0]) {
				// boundary condition check - if play score is greater than equal to highest
				// score
				alice_rank[i] = 1;
			} else if (alice_score[i] < score[lenScore - 1]) {
				// boundary condition check - if play score is less than equal to lowest score
				alice_rank[i] = rank[lenScore - 1] + 1;
			} else {
				// apply binary search to get the index and set that the score
				int idx = binarySearch(ranked, player.get(i));
				alice_rank[i] = rank[idx];
			}

		}

		return Arrays.stream(alice_rank).boxed().collect(Collectors.toList());

	}

	public static Integer binarySearch(List<Integer> ranked, Integer player_score) {
		int low = 0;
		int high = ranked.size() - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (player_score == ranked.get(mid)) {
				return mid;
			} else if (ranked.get(mid) < player_score && player_score < ranked.get(mid - 1)) {
				return mid;
			} else if (ranked.get(mid) > player_score && player_score >= ranked.get(mid + 1)) {
				return mid + 1;
			} else if (ranked.get(mid) < player_score) {
				high = mid - 1;
			} else if (ranked.get(mid) > player_score) {
				low = mid + 1;
			}

		}

		return -1;

	}

}

public class ClimbingtheLeaderboard {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> result = ClimbingtheLeaderboardResult.climbingLeaderboard(ranked, player);
		System.out.print(result);

		// bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n"))
		// + "\n");

		bufferedReader.close();
		// bufferedWriter.close();
	}
}
