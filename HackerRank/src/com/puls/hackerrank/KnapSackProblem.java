package com.puls.hackerrank;

public class KnapSackProblem {

	public static void main(String[] args) {

		int n = 5;
		int cap = 7;
		int[] wts = { 2, 5, 3, 1, 4 };
		int[] val = { 15, 14, 10, 45, 30 };

		int[][] dp = new int[n + 1][cap + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				// when number of balls greater

				if (j > wts[i - 1]) {
					int rap = j - wts[i - 1];
					if (dp[i - 1][rap] + val[i - 1] > dp[i - 1][j]) {
						dp[i][j] = dp[i - 1][rap] + val[i - 1];
					} else {
						dp[i][j] = dp[i - 1][j];// because the player cant bat since number of balls are less
					}

				} else {
					// all the runs made by previous player
					dp[i][j] = dp[i - 1][j]; // because the player cant bat since number of balls are less
				}

			}
		}

		System.out.print(dp[n][cap]);
	}

}
