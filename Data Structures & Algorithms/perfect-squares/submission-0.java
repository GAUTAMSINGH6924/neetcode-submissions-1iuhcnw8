class Solution {
    public int helper(int[] arr, int idx, int target, Integer[][] dp) {
        if (target == 0) {
            return 0;
        }

        if (idx == 0) {
            return target;
        }

        if (dp[idx][target] != null) {
            return dp[idx][target];
        }

        int notTake = helper(arr, idx - 1, target, dp);
        int take = Integer.MAX_VALUE;

        if (target >= (arr[idx] * arr[idx])) {
            take = 1+helper(arr, idx, target - (arr[idx] * arr[idx]), dp);
        }

        return dp[idx][target] = Math.min(notTake, take);
    }
    public int numSquares(int n) {
        int m = (int) Math.sqrt(n);
        int[] arr = new int[m];
        for (int i = 1; i <= m; i++) {
            arr[i - 1] = i;
        }

        Integer[][] dp = new Integer[m][n + 1];

        return helper(arr, m - 1, n, dp);
    }
}