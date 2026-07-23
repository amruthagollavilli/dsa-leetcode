import java.util.Arrays;

class Solution {

    public int uniquePaths(int m, int n) {

        // Create a DP array
        int[][] dp = new int[m][n];

        // Fill every cell with -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        // Start recursion from the destination
        return solve(m - 1, n - 1, dp);
    }

    public int solve(int i, int j, int[][] dp) {

        // Base Case 1
        if (i == 0 && j == 0)
            return 1;

        // Base Case 2
        if (i < 0 || j < 0)
            return 0;

        // If already calculated, return it
        if (dp[i][j] != -1)
            return dp[i][j];

        // Calculate paths
        int up = solve(i - 1, j, dp);
        int left = solve(i, j - 1, dp);

        // Store answer
        dp[i][j] = up + left;

        return dp[i][j];
    }
}